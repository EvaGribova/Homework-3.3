public class CreditPaymentService {

    public int calculate(int amount, double percent, int monthsOfCredit) {
        double x = amount * (percent / 1200 + ((percent / 1200) /(Math.pow(1 + percent/1200, monthsOfCredit) - 1)));
        int payment = (int) x;
        return payment;
    }
}
