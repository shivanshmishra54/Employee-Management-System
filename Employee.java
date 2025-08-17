import java.util.*;

public class Employee {
    private String name;
    private int id;
    private String role;
    private String phone;
    private String location;
    private double baseSalary;
    private Map<String, Boolean> attendance;

    public Employee(String name, int id, String role, String phone, String location, double baseSalary) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.phone = phone;
        this.location = location;
        this.baseSalary = baseSalary;
        this.attendance = new HashMap<>();
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public String getRole() { return role; }
    public String getPhone() { return phone; }
    public String getLocation() { return location; }

    // Setters
    public void setLocation(String location) {
        System.out.println("Last Location: " + this.location);
        this.location = location;
        System.out.println("Location Updated Successfully!!");
    }

    public void setPhone(String phone) {
        System.out.println("Current Phone Number: " + this.phone);
        this.phone = phone;
        System.out.println("Phone Number Updated Successfully!!");
    }

    // Attendance add karna
    public void addAttendance(String date, boolean isPresent) {
        attendance.put(date, isPresent);
    }

    // Total attendance %
    public double totalAttendance() {
        if (attendance.isEmpty()) {
            return 0.0;
        }
        int presentCount = 0;
        for (boolean present : attendance.values()) {
            if (present) presentCount++;
        }
        return (presentCount * 100.0) / attendance.size();
    }

    // Salary calculation
    public double calculateSalary() {
        double percentage = totalAttendance();
        return (baseSalary * percentage) / 100.0;
    }

    // Display details
    public void displayDetails() {
        System.out.println("===== EMPLOYEE DETAIL =====");
        System.out.println("EMPLOYEE NAME: " + name);
        System.out.println("EMPLOYEE ID: " + id);
        System.out.println("EMPLOYEE ROLE: " + role);
        System.out.println("PHONE: " + phone);
        System.out.println("LOCATION: " + location);
        System.out.println("BASE SALARY: " + baseSalary);
        System.out.println("ATTENDANCE %: " + totalAttendance());
        System.out.println("FINAL SALARY: " + calculateSalary());
    }
}
