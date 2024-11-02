public class Student {
    int m1, m2, m3; //instance fields

    void setStudent(int a, int b, int c) //instance mtd
    {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void getStudent() {
        System.out.println("M1 : " + m1);
        System.out.println("M2 : " + m2);
        System.out.println("M3 : " + m3);
    }

    boolean findResult() //instance mtd
    {
        if (m1 > 34 && m2 > 34 && m3 > 34) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setStudent(80, 60, 50);
        s.getStudent();

        if (s.findResult()) // here s.findResult() -> returns either true or false
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }
}