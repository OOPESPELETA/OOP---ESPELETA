package student;
import java.util.*;

class Student {
    private String name;
    private double gwa;
    private String section;

    public Student(String name, double gwa, String section) {
        this.name = name;
        this.gwa = gwa;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public double getGWA() {
        return gwa;
    }

    public String getSection() {
        return section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGWA(double gwa) {
        this.gwa = gwa;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        int count = 0;

        while (true) {
            System.out.println("--Student Registration--");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. View");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (count < 10) {
                    System.out.println("Enter Name, GWA and Course" );
                    String name = sc.next();
                    double gwa = sc.nextDouble();
                    String section = sc.next();

                    students[count] = new Student(name, gwa, section);
                    count++;
                    System.out.println("New Student has been added.");
                } else {
                    break;
                }
            } else if (choice == 2) {
                System.out.print("Enter the student number to edit (1-" + count + "): ");
                int sn = sc.nextInt();
                if (sn >= 1 && sn <= count) {
                    Student edit = students[sn - 1];

                    String newName = sc.next();
                    edit.setName(newName);

                    double newGwa = sc.nextDouble();
                    edit.setGWA(newGwa);

                    String newSection = sc.next();
                    edit.setSection(newSection);

                    System.out.print("Student's new details: ");
                    System.out.println( edit.getName() + " " + edit.getGWA() + " " + edit.getSection());
                } else {
                    System.out.println("Invalid student number. Please enter a number between 1 and " + count + ".");
                }
                } else if (choice == 3) {
                      System.out.println("Student List:");
                        for (int i = 0; i < count; i++) {
                         System.out.println( students[i].getName() + " " + students[i].getGWA() + " " + students[i].getSection());
                    }
                }
                else if (choice == 4) {
                                System.out.println("Exiting the program.");
                                break;
               } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                    }
                }
