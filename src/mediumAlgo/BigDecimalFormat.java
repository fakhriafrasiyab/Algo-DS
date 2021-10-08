package mediumAlgo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalFormat {
    private static String currencyFormat(BigDecimal n) {
        DecimalFormat df = new DecimalFormat("#,##0");
        return df.format(n);
    }

    public static void main(String[] args) {
        System.out.println(currencyFormat(BigDecimal.valueOf(50000)));
    }
}
