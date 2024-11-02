public class Book1 {
    static String bname = "java";
    int bpages = 578;
    String bpublisher = "PoojaPrintingPress";
    static String bauthor = "John.RJ";
    static String bcolor = "Black";

    public static void bookDetails() {
        System.out.println("Name : " + bname);
        Book1 b1 = new Book1();//here b1 is local
        System.out.println("Pages : " + b1.bpages);
        System.out.println("Published by : " + b1.bpublisher);
        System.out.println("Author is : " + bauthor);
        System.out.println("Color is : " + bcolor);
    }

    public void shopkeeper() {
        String sname = "Ramu Anna";//local var
        String saddress = "kingKoti beside busstop opposite to Bahubali teastall";//local var
        System.out.println("I have Purchased from : " + sname);
        System.out.println("Address : " + saddress);
        bookDetails();
    }

    public static void main(String args[]) {
//b1.shopkeeper();//CTE because b1 is local to bookDetails()
        System.out.println("<<<<<<<<Love Story of Book>>>>>>>>");
        Book1 b2 = new Book1();//here we can again create object as b1 also,bcoz every time we create an object it will be local to its scope
        b2.shopkeeper();
    }
}