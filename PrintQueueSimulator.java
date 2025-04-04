import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    private int jobId;
    private String documentName;
    private int pages;

    public PrintJob(int jobId, String documentName, int pages) {
        this.jobId = jobId;
        this.documentName = documentName;
        this.pages = pages;
    }

    public int getJobId() {
        return jobId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getPages() {
        return pages;
    }
}

class PrintQueue {
    private Queue<PrintJob> queue = new LinkedList<>();

    public void addJob(PrintJob job) {
        queue.add(job);
        System.out.println("Added job: " + job.getDocumentName());
    }

    public void processJob(PrintJob job) {
        if (queue.remove(job)) {
            System.out.println("\n" +"Processing job: " + job.getDocumentName());
        } else {
            System.out.println("Job not found in the queue.");
        }
    }

    public PrintJob peekNextJob() {
        return queue.peek();
    }

    public void displayAllJobs() {
        if (queue.isEmpty()) {
            System.out.println("No jobs in the queue.");
            return;
        }
        System.out.println("\n" + "Current print jobs in the queue:");
        for (PrintJob job : queue) {
            System.out.println("Job ID: " + job.getJobId() + ", Document: " + job.getDocumentName() + ", Pages: " + job.getPages());
        }
    }
}

public class PrintQueueSimulator {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        printQueue.addJob(new PrintJob(1, "Architect.pdf", 10));
        printQueue.addJob(new PrintJob(2, "Engineer.pdf", 8));
        printQueue.addJob(new PrintJob(3, "ITechnology.pdf", 15));

        printQueue.displayAllJobs();

        PrintJob nextJob = printQueue.peekNextJob();
        if (nextJob != null) {
            printQueue.processJob(nextJob);
        }

        
        printQueue.displayAllJobs();
    }
}