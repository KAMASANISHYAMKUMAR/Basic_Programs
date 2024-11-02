//method with return type
public class Loginpage {
    public static boolean login(String name, int pwd) {
        if (name == "Shyam" && pwd == 12345) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(login("Shyam", 12345));
    }
}


