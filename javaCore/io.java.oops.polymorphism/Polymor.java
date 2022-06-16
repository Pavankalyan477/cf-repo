

public class Polymor{

    // Overrriding

    void show(){
        System.out.println("Method Overriding");
    }


    // Polymorphism
    // Overloading

    public void sum(int x){
        System.out.println(x);

    }

    public int sum(int x, int y){
        return x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public String sum(String x,String y){
        return x+y;
    }


    public static void main(String[] args){
        Polymor obj=new Polymor();

        obj.sum(6);
        System.out.println(obj.sum("Pavan","Kalyan"));
        System.out.println(obj.sum(4,6));
        System.out.println(obj.sum(3,4,5));
    }
}