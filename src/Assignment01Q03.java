public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long a = 0, b = 1;
        long numOdd = 0;
        for (int i = 0; i < x; i++)
        {
            System.out.print(b);
            if ((b) % 2 != 0) 
            {
                numOdd++;
            }
            long keep = b;
            b = a + b;
            a = keep;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
