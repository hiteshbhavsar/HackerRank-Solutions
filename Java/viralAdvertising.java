import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class viralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        if(n==0)
        {
            return 0;
        }else if(n==1)
        {
            return (int)Math.floor(5/2);
        }
        
        int sum=0,liked=0,people=5;
            for(int i=0;i<n;i++)
            {
                liked+=(int)Math.floor(people/2);
                people=(int)Math.floor(people/2)*3;
                
            }
        return liked;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
