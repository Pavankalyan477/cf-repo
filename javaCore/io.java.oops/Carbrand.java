import java.util.*;

public class Carbrand extends Carmain {

    int price;
    String engineType;

    public Carbrand(String carBrand, int invYear, String color, int price, String engineType){
        super(carBrand,invYear,color);
        this.price=price;
        this.engineType=engineType;
    }

    public void setPrice(int price){
        this.price=price;
    }
    public void setengineType(String engine){
        this.engineType=engine;
    }

    public int getPrice(){
        return this.price;
    }
    public String getengineType(){
        return this.engineType;
    }

    public static void main(String[] args){
        Carmain obj1=new Carbrand("Bajaj", 1996,"red", 150000, "generic");
       

        System.out.println(obj1.getengineType());
        System.out.println();
        System.out.println(obj1.get);

    }


    
}
