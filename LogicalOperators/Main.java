package LogicalOperators;

public class Main {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isElegible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isElegible);
    }
}
