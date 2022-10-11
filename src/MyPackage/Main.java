package MyPackage;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            //fetch student record based on his roll no from the database

            CrudRepo R=new CrudRepo();

            System.out.println("nAfter updating, Course Details are as follows");
            boolean ok=true;
            while(ok){
                Scanner sc = new Scanner(System.in);
                System.out.print("""
                        Enter number:\040
                        1-create
                        2-read
                        3-update
                        4-delete
                        0-exit
                        """);
                int n=sc.nextInt();
                if(n==1){
                    //create
                    R.create();
                }
                if(n==2){
                    //read
                    R.view();
                }
                if(n==3){
                    //update
                    R.update();
                }
                if(n==4)
                {
                    //delete
                    R.delete();
                }
                if(n==0)
                {
                    ok=false;
                }

            }
        }


}
