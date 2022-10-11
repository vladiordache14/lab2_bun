package MyPackage;
import java.util.Scanner;

public class CrudRepo {
//    Student model  = retriveCourseFromDatabase();
    Student model  = create_blank();

    //Create a view : to write course details on console
    StudentProfile view = new StudentProfile();
    Controller C=new Controller(model,view);
    public String readName(){
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }

    public String readID(){
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }

    public String readCategory(){
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }

//    public Student retriveCourseFromDatabase(){
//        Student student = new Student();
//        student.setName("Mihai");
//        student.setId("4227");
//        student.setCategory("caucazian");
//        return student;
//
//    }

    public Student create_blank(){
        Student student = new Student();
        student.setName("None");
        student.setId("None");
        student.setCategory("None");
        return student;
    }

    public void create(){
        C.setStudentName("Mihai");
        C.setStudentId("4226");
        C.setStudentCategory("black");
    }
    public void view(){
        C.updateView();
    }

    public void update(){
        C.setStudentName(readName());
        C.setStudentId(readID());
        C.setStudentCategory(readCategory());
    }

    public void delete(){
        C.setStudentName("");
        C.setStudentId("");
        C.setStudentCategory("");
    }
}
