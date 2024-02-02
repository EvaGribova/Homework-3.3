public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        double percent = 9.99;
        int monthsOfCredit = 36;
        int payment = service.calculate(amount, percent, monthsOfCredit);
        System.out.println("Платеж по кредиту - " + payment);

    }
}