public class Main {
    public static void main(String[] args) {

        BankAccount KICB = new BankAccount();
        KICB.deposit(20000.00);
        while (true) {
            try {
                KICB.withDraw(6000);
            } catch (LimitException e) {
                try {
                    KICB.withDraw((int) e.getRemainingAmount());
                } catch (LimitException el) {
                    el.printStackTrace();
                }
                break;
            }
        }
    }
}