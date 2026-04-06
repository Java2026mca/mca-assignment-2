import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // TODO: Custom checked exception: InvalidAgeException extends Exception
        //   Method: static String validateAge(int age) throws InvalidAgeException
        //     age < 0   → throw InvalidAgeException("Age cannot be negative: " + age)
        //     age < 18  → throw InvalidAgeException("Age too young to register: " + age)
        //     age > 120 → throw InvalidAgeException("Age unrealistic: " + age)
        //     else      → return "Valid"
        //   Catch and print message or "Valid"
        //
        // Input: 4 / 25 / 15 / -3 / 200
        // Output: Valid / Age too young to register: 15 / Age cannot be negative: -3 / Age unrealistic: 200
    }
}
