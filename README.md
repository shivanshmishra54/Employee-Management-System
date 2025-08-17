# 📌 Employee Management System (Java Console Application)

A **console-based Java project** to manage employees efficiently using **Core Java, OOP principles, and Collections Framework**.  
This project allows managers to add employees, update their details, mark attendance, calculate attendance percentage, and generate salary automatically based on attendance.  

---

## 🚀 Features

- ➕ **Add Employee** – Enter name, ID, role, phone, location, and base salary.  
- ❌ **Delete Employee** – Remove an employee by ID.  
- 🔍 **Search & View Employee** – Search employee by ID and access detailed options.  
- 📅 **Attendance Management** – Mark daily attendance using `HashMap<String, Boolean>`.  
- 📊 **Attendance Percentage** – Calculates the attendance percentage based on marked records.  
- 💰 **Salary Calculation** – Auto-calculates salary according to attendance percentage.  
- 📝 **Update Details** – Change employee location or phone number anytime.  
- 👀 **View All Employees** – Display all employees and their details.  

---

## 🛠 Technologies Used

- **Language:** Java (Core Java)  
- **Concepts:** OOP (Encapsulation, Abstraction), Collections (`ArrayList`, `HashMap`)  
- **Tools:** VS Code / IntelliJ IDEA  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure

EmployeeManagementSystem/
│── Employee.java # Employee class with details & attendance logic
│── Manager.java # Manager class to handle multiple employees
│── Main.java # Entry point with console-based menu
│── README.md # Project documentation

---

## ⚙️ How It Works

1. Run the program.  
2. Main menu options:  
   - Add / Delete / View / Manage Employees.  
3. Inside employee menu:  
   - Update attendance (present/absent).  
   - View attendance %.  
   - Calculate salary.  
   - Update phone/location.  
4. Data is stored in memory using `ArrayList` (for employees) and `HashMap` (for attendance).  

---

## 🎯 Future Enhancements

- Save employee data permanently using **File Handling / Database**.  
- Add authentication (Manager Login).  
- GUI-based interface using **JavaFX** or **Swing**.  
- Export salary reports in **CSV / Excel format**.  

---

## 📸 Demo (Console Flow)

<img width="527" height="348" alt="image" src="https://github.com/user-attachments/assets/4c29718e-3162-44f7-8e24-6d437470b379" />


---

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.  

---

## 📜 License

This project is **open-source** and available under the MIT License.  
