public class CarA {
    static String brname = "Audi";
    int capacity = 4;

    public void details() {
        String color = "Black";
        long price = 5500000l;
        System.out.println("Car name :" + brname);
        System.out.println("Car capacity :" + capacity);
        System.out.println("Color is :" + color);
        System.out.println("Starting Price :" + price);
    }

    public static void features() {
        CarA c1 = new CarA();
        c1.details();
        System.out.println(c1.capacity);
    }

    public static void main(String[] args) {
        features();
    }
}