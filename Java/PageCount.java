import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PageCount {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
         
         /*
         Refer this post to understand why to add (double) in the ceil function
         https://stackoverflow.com/questions/7139382/java-rounding-up-to-an-int-using-math-ceil/21830188
         
         */
         if(p==1||p==n) return 0;
         
         int fromStart=0,fromLast=0;
        if(p%2==0)
        {
            fromStart=p/2;                 
        }
        else
        {
            fromStart=(p-1)/2;
        }

         
         if(n%2==0)
         {
             if(p%2==0)
             {
                fromLast=(n-p)/2;                 
             }
             else
             {
                 fromLast=(int)Math.ceil((double)(n-p)/2);
             }

         }
         else
         {
             if(p%2==0)
             {
                 fromLast=(int)Math.floor((double)(n-p)/2);
             }
             else
             {
                 fromLast=(n-p)/2;
             }
         }
         System.out.println("fromStart: "+fromStart+"\nfromLast: "+fromLast);
        return Math.min(fromStart,fromLast);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
