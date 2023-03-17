package friday;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int n;
        n = 20;
        if (n>=2)
            System.out.println("run 0 - 4 miles, the fee is $2" + ".");

        if (n>=5)
            System.out.println("run 5 - 15 miles, the fee is $5" + ".");

        if (n>=10)
            System.out.println("run 16 - 25 miles, the fee is $10" + ".");

        if (n>=15)
            System.out.println("run 26 - 50 miles, the fee is $15" + ".");

        if (n==20)
            System.out.println("run more than 50 miles, the fee is $20" + ".");


    }
}
