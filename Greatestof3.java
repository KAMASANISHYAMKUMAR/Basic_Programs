class Greatestof3 {
    public static void main(String[] args) {
        int a = 10, b = 27, c = 6;
        if (a > b && a > c) {
            System.out.println("A is the biggest number");
        } else if (b > c && b > a) {
            System.out.println("B is the biggest number");
        } else {
            System.out.println("c is the biggest number");
        }
    }
}

