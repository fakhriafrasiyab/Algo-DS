package mediumAlgo;

import java.math.BigInteger;

public class ExtraLongFactorial {
    static void extraLongFactorials(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
