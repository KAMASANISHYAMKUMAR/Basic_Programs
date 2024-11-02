public class PaymentDemo {
    public static void payment(String wallettype, int UID) {
        System.out.println("WalletType :"+wallettype);
        System.out.println("UID :"+UID);
    }

    public static void payment(String cardtype, long cardno, int cvvnumber) {
        System.out.println("CardType:" + cardtype);
        System.out.println("Cardno :" + cardno);
        System.out.println("CVV number :" + cvvnumber);
    }

    public static void payment(String type, String username, int pwd, long Accountnumber) {
        System.out.println("Type :" + type);
        System.out.println("Username :" + username);
        System.out.println("pwd :" + pwd);
        System.out.println("Accountnumber :" + Accountnumber);
    }

    public static void main(String[] args) {
        payment("Gpay", 6464);
        payment("Debitcard", 1413546358463854l, 123);
        payment("savings", "Google", 1354515, 41684416416845424l);
    }
}



