class IsDivisible2 {
    public static void main(String[] args) {
        int number = 8;
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("number is divisible by both 3,4");
        } else if (number % 3 == 0) {
            System.out.println("number is only divisible by 3");
        } else if (number % 4 == 0) {
            System.out.println("number is only divisible by 4");
        }
    }
}