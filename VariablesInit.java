class VariablesInit {

    public static void main(String[] args) {

        String name = "Shyam kumar";
        double price = 9.99;
        int quantity = 2;
        boolean outOfStock = false;

        String anotherName = name;
        double amount = quantity * price;

        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(outOfStock);

        System.out.println(anotherName);
        System.out.println(amount);
    }
}
