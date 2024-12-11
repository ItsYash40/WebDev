//package mypackage;

public class Student {
    private String name;
    private int roll_number;

    public Student(String name, int roll_number) {
        this.name = name; 
        this.roll_number = roll_number; 
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll_number);
    }

//    public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Yash", 9);
            
            student1.displayDetails();
        }
}

