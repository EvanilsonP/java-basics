package FormatingNumbers;

import java.text.NumberFormat;

public class FNumbers {
    
    public static void main(String[] args) {

        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.89);
        // System.out.println(result);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result = percent.format(0.1); // 10%
        // System.out.println(result);

        String result = NumberFormat.getPercentInstance().format(0.1); // 10%
        System.out.println(result);
    }
}
