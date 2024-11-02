class IsDivisible1 {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0 && number % 4 == 0) {
            System.out.println("number is divisible by both 2,4");
        } else if (number % 2 == 0) {
            System.out.println("number is only divisible by 2");
        } else if (number % 4 == 0) {
            System.out.println("number is only divisible by 4");
        }
    }
}