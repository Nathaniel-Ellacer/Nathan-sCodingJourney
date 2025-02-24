package Algorithm;


public class SimpleAlgorithm
{
        public double findAverage(int[] numbers)
        {
            double total = 0;
            for (int i = 0; i < numbers.length; i++)
            {
                total += numbers[i];
            }
            return total / numbers.length;
        }
    }
