import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // TODO: Multilevel inheritance: Person → Employee → Manager
        //   Person(name,age)         → getInfo(): "Person: <n>, Age: <age>"
        //   Employee(name,age,company,salary) → getInfo(): "Employee: <n>, Company: <co>, Salary: <sal>"
        //   Manager(name,age,company,salary,dept) → getInfo(): "Manager: <n>, Dept: <dept>, Salary: <sal>"
        //   Use super() at each level
        //
        // Input: 3 / PERSON Rahul 22 / EMPLOYEE Priya 30 TCS 60000 / MANAGER Amit 45 Infosys 120000 Engineering
        // Output: Person: Rahul, Age: 22 / Employee: Priya, Company: TCS, Salary: 60000 / Manager: Amit, Dept: Engineering, Salary: 120000
    }
}
