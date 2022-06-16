

public class Childpoly extends Polymor{


    @Override
    void show(){
        System.out.println("Method overriding by Child");
    }


    public static void main(String[] args){

        Polymor obj1=new Childpoly();
        obj1.show();

        Polymor obj2=new Polymor();
        obj2.show();
    }



}