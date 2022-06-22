public class Studentdetails extends Commondetails {

//    public void go(){
//        System.out.println("I am in student class");
//    }
    int fee;




    public Studentdetails(int id, String name, String courseName,int payment) {
        super(id,name,courseName);
        this.fee = payment;
    }

    public static void main(String[] args) {
   Studentdetails st = new Studentdetails(100,"pk","",0);
   System.out.println(st);
    }


}
