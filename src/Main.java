public class Main {
    public static void main(String[] args) {
        int currentBalance = 149;
        int income = 1100;
        int bonus = 100;
        int finalBalance;
        if (income > 1000) {
           finalBalance = currentBalance + income + (income/ bonus);
        } else {
            finalBalance = currentBalance + income;
        }
        System.out.println(finalBalance);
    }
}
