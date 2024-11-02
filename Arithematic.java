class Arithematic {
    int x;
    int y;
    int add;
    int sub;
    int mul;
    int div;

    public static void main(String args[]) {
        Arithematic A = new Arithematic();
        A.x = 10;
        A.y = 20;

//Arithematic operations

        A.add = A.x + A.y;//addition
        A.sub = A.y - A.x;//subtraction
        A.mul = A.x * A.y;//multiplaction
        A.div = A.y / A.x;//division

        System.out.println("addition of two numbers is :" + A.add);
        System.out.println("subtraction of two numbers is :" + A.sub);
        System.out.println("multiplaction of two numbers is :" + A.mul);
        System.out.println("division of two numbers is :" + A.div);

    }
}
