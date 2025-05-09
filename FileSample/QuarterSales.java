package FileSample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat; // Import DecimalFormat
import java.util.Scanner;

public class QuarterSales {

    static DecimalFormat df = new DecimalFormat("$##,###.00"); // Added semicolon
    static Scanner inputFile;
    static PrintWriter outputFile;
    static String rowData, fname, lname, name;
    static String[] specificRow = new String[6];
    static double q1 = 0.0, q2 = 0.0, q3 = 0.0, q4 = 0.0;
    static double agentSalesAve = 0.0, OverAllSales = 0.0, agentCounter = 0.0, overAllSalesAve = 0.0;

    public static void main(String[] args) throws FileNotFoundException {
        openFile();
        processFile();
        closeFile();
    }

    public static void openFile() throws FileNotFoundException {
        inputFile = new Scanner(new FileReader("SaleData.csv"));
        outputFile = new PrintWriter("OutputSalesData.csv"); // Changed to avoid overwriting the input file
    }

    public static void processFile() {
        printHeader();
        while (inputFile.hasNext()) {
            rowData = inputFile.nextLine();
            specificRow = rowData.split(",");

            fname = specificRow[0];
            lname = specificRow[1];

            name = lname.toUpperCase() + ", " + fname;

            q1 = Double.parseDouble(specificRow[2]);
            q2 = Double.parseDouble(specificRow[3]);
            q3 = Double.parseDouble(specificRow[4]);
            q4 = Double.parseDouble(specificRow[5]);

            agentSalesAve = (q1 + q2 + q3 + q4) / 4;
            OverAllSales += agentSalesAve;

            System.out.println(name + "\t" + df.format(q1) + "\t" + df.format(q2) + "\t" +
                               df.format(q3) + "\t" + df.format(q4) + "\t" + df.format(agentSalesAve));
            agentCounter++;
        }
        outputFile.println();
        overAllSalesAve = OverAllSales / agentCounter;
         outputFile.println("Overall Sales of Agent for the year: " + df.format(overAllSalesAve)); // Fixed typo
    }

    public static void printHeader() {
        outputFile.println("Moonlife");
        outputFile.println("Agent's Quarterly Report");
        outputFile.println();
        outputFile.println("Agent Name\tQuarter1\tQuarter2\tQuarter3\tQuarter4\tAverage Sales");
        outputFile.println();
    }

    public static void closeFile() {
        inputFile.close();
        outputFile.close();
    }
}