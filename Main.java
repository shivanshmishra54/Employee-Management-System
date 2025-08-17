import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m1 = new Manager();

        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. DELETE EMPLOYEE");
            System.out.println("3. VIEW EMPLOYEE");
            System.out.println("4. VIEW ALL EMPLOYEES");
            System.out.println("5. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Role: ");
                    String role = sc.nextLine();

                    System.out.print("Enter Employee Phone No: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Employee Current Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double baseSalary = sc.nextDouble();

                    Employee emp = new Employee(name, id, role, phone, location, baseSalary);
                    m1.addEmployee(emp);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    m1.deleteEmployee(deleteId);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to view: ");
                    int viewId = sc.nextInt();
                    sc.nextLine();

                    Employee viewEmp = m1.searchEmployee(viewId);
                    if (viewEmp != null) {
                        boolean backToMain = false;
                        while (!backToMain) {
                            System.out.println("\n--- EMPLOYEE MENU ---");
                            System.out.println("1. UPDATE ATTENDANCE");
                            System.out.println("2. VIEW ATTENDANCE %");
                            System.out.println("3. VIEW SALARY");
                            System.out.println("4. CHANGE LOCATION");
                            System.out.println("5. CHANGE PHONE NUMBER");
                            System.out.println("6. EXIT TO MAIN MENU");
                            System.out.print("Enter Your Choice: ");
                            int ch = sc.nextInt();
                            sc.nextLine();

                            switch (ch) {
                                case 1:
                                    System.out.print("Enter Date (yyyy-mm-dd): ");
                                    String date = sc.nextLine();
                                    System.out.print("Is Present? (true/false): ");
                                    boolean isPresent = sc.nextBoolean();
                                    sc.nextLine();
                                    viewEmp.addAttendance(date, isPresent);
                                    System.out.println("Attendance Updated!");
                                    break;

                                case 2:
                                    System.out.println("Attendance %: " + viewEmp.totalAttendance());
                                    break;

                                case 3:
                                    System.out.println("Salary based on attendance: " + viewEmp.calculateSalary());
                                    break;

                                case 4:
                                    System.out.print("Enter new location: ");
                                    String newLoc = sc.nextLine();
                                    viewEmp.setLocation(newLoc);
                                    break;

                                case 5:
                                    System.out.print("Enter New Phone Number: ");
                                    String newPh = sc.nextLine();
                                    viewEmp.setPhone(newPh);
                                    break;

                                case 6:
                                    backToMain = true;
                                    System.out.println("Returning to Main menu...");
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                            }
                        }
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    m1.displayAllEmployee();
                    break;

                case 5:
                    System.out.println("THANK YOU\nWORK IS DONE!!!");
                    return;

                default:
                    System.out.println("INVALID CHOICE!!!! TRY AGAIN");
                    break;
            }
        }
    }
}
