import java.util.Scanner;

class Student_Detail {
    int Enrollment_ID;
    String Name;
    int semester;
    double CPI;
    
}

public class Student {
    public static void main(String[] args) {
        Student_Detail student = new Student_Detail();
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] S = new Student_Detail[5];
        int i;
        for(i=0;i<5;i++){
            S[i]=new Student_Detail();
            System.out.println("Enter Enrollment_ID : ");
            S[i].Enrollment_ID = scanner.nextInt();

            System.out.println("Enter Name: ");
            S[i].Name = scanner.next();

            System.out.println("Enter semester: ");
            S[i].semester = scanner.nextInt();

            System.out.println("Enter CPI: ");
            S[i].CPI = scanner.nextDouble();
        }

        System.out.println("Student Details: ");
        
        for(i=0;i<5;i++){
            System.out.println("Enrollment_ID :"+S[i].Enrollment_ID);
            System.out.println("Name :"+S[i].Name);
            System.out.println("semester :"+S[i].semester);
            System.out.println("CPI :"+S[i].CPI);

        }
    }


}