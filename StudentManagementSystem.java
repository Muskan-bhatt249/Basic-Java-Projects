import java.util.*;
class Student{
int rollNumber;
String name;
String branch;
int cgpa;
 
Student(int rollNumber, String name, String branch, int cgpa){
    this.rollNumber= rollNumber;
    this.name= name;
    this.branch= branch;
    this.cgpa=cgpa;
}
void displayinfo(){
    System.out.println("Student Roll Number- "+ rollNumber);
    System.out.println("Student Name- " + name);
    System.out.println("Student Branch-" + branch);
    System.out.println("Student CGPA- " + cgpa);
}
 
}
public class StudentManagementSystem{
    static ArrayList<Student> studentInformation =new ArrayList<>();
    static Scanner sc= new Scanner(System.in);

    static void addstudent(){
        System.out.println("Enter how many students you need to add-");
        int studentnumber= sc.nextInt();
    
        for (int k=0; k<studentnumber;k++){
        System.out.println("Enter Roll Number- ");
        int rnum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name- ");
        String sname= sc.nextLine();
        System.out.println("Enter Branch- ");
        String sbranch = sc.nextLine();
        System.out.println("Enter CGPA- ");
        int scgpa =sc.nextInt();
        studentInformation.add(new Student(rnum, sname, sbranch, scgpa));
        System.out.println("Student Added succesfully");
        System.out.println("---------------------------------");
}

    }
    static void displaystudent(){
        System.out.println("All the student information is as follows- ");
        System.out.println("---------------------------------");
        for (int i=0; i<studentInformation.size(); i++){
            studentInformation.get(i).displayinfo();
            System.out.println("---------------------------------");
        }
    }
    static void searchstudent(){
        System.out.println("Enter Student roll number to be searched- ");
        int roll= sc.nextInt();
        boolean found= false;
        for (int i=0; i<studentInformation.size(); i++){
            if (studentInformation.get(i).rollNumber == roll){
                System.out.println("Student Found-");
              studentInformation.get(i).displayinfo();
              System.out.println("---------------------------------");
              found =true;
              break;
            }
        
        }
        if(!found){
            System.out.println("Student not found");
            System.out.println("---------------------------------");
        }

    }
    static void deletestudent(){
        System.out.println("Enter Student Roll number to be deleted- ");
        int roll= sc.nextInt();
        boolean found = false;
        for (int i=0; i<studentInformation.size(); i++){
            if (studentInformation.get(i).rollNumber == roll){
              studentInformation.remove(i);
              System.out.println("Student deleted from record");
              System.out.println("---------------------------------");
              found = true;
            break;
            }
        

        }
        if(!found){
            System.out.println("Student not found");
            System.out.println("---------------------------------");
        }


    }

    public static void main(String[] args) {
        System.out.println ("STUDENT MANAGEMENT SYSTEM");
        System.out.println("----------------------------------------------------");


    System.out.println("Choose according to the following menue");
    System.out.println("1--> Display Student details");
    System.out.println("2--> Add Student details");
    System.out.println("3--> Search Student details");
    System.out.println("4--> Delete Student details");
    System.out.println("5--> Exit ");
    System.out.println("\n");

    int choice;
    do { 
        System.out.println("Enter your menue choice- ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            displaystudent();
            break;
            case 2:
            addstudent();
            break;
            case 3:
            searchstudent();
            break;
            case 4:
            deletestudent();
            break;
            case 5:
            System.out.println("Thanks for testing!!- Program ends!!");
            break;
            default:
            System.out.println("Invalid choice entered");


        }
    } while (choice!=5);


        
    }
}
