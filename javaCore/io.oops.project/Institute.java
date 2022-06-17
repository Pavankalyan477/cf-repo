import java.util.ArrayList;

public class Institute{

    Teacherdetails Teacher;
    Studentdetails Student;

    // int Gradingdesign(){

    // }

    // int PaymentCalc(){

    // }

    public Institute(Studentdetails student) {
        Student = student;
    }

    public static void main(String[] args) {
        

         Institute obj=new Institute(new Student(1,"pavan","Maths",20000));
         System.out.println(obj.Student);
        
        
    }
    
}
