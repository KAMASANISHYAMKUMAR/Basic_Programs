//local variables
public class EmployeeDetails {
    public static void displaydetails() {
//local variables
        String ename = "Shyam kumar";
        int eid = 219;
        String desig = "Project Engineer";
        System.out.println("Employee Name is :" + ename);
        System.out.println("Employee Id is :" + eid);
        System.out.println("Employee Designitation is :" + desig);
    }

    public static void main(String[] args) {
        displaydetails();//to use local variables we need to call method
//varibles inside main method

        String ename = "Shyam";
        int eid = 2130;
        String desig = "Web Engineer";
        System.out.println("Employee Name is :" + ename);
        System.out.println("Employee Id is :" + eid);
        System.out.println("Employee Designitation is :" + desig);
    }
}