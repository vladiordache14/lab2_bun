package MyPackage;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            //fetch student record based on his roll no from the database
            Student model  = retriveCourseFromDatabase();

            //Create a view : to write course details on console
            StudentProfile view = new StudentProfile();

            Controller controller = new Controller(model, view);
            CrudRepo R=new CrudRepo();

            System.out.println("nAfter updating, Course Details are as follows");
            boolean ok=true;
            while(ok){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number- ");
                int n=sc.nextInt();
                if(n==1){
                    //create
                    System.out.println(retriveCourseFromDatabase());

                }
                if(n==2){
                    //read
                    controller.updateView();

                }
                if(n==3){
                    //update
                    controller.setStudentName(R.readName());
                    controller.setStudentId(R.readID());
                    controller.setStudentCategory(R.readCategory());
                }
                if(n==4)
                {
                    //delete
                    controller.setStudentName("");
                    controller.setStudentId("");
                    controller.setStudentCategory("");
                }
                if(n==0)
                {
                    ok=false;
                }

            }
        }

        private static Student retriveCourseFromDatabase(){
            Student student = new Student();
            student.setName("Mihai");
            student.setId("4227");
            student.setCategory("caucazian");
            return student;

    }
}