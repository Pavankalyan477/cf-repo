public class Studentdetails extends Commondetails {
    
    int fee;




    public Studentdetails(int id, String name, String courseName,int payment) {
        super(id,name,courseName);
        this.fee = payment;
    }

    public static void main(String[] args) {
        
    }


}
