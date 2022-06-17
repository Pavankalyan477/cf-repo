import java.util.*;
public class Carmain {
    private String carBrand;
    private int invYear;
    private String color;

    // Carmain(String carBrand, int invYear, String color) {
    //     this.carBrand = carBrand;
    //     this.invYear = invYear;
    //     this.color = color;
    // }

    public void setcarBrand(String brand){
       this.carBrand=brand;
    }

    public void setinvYear(int year){
        this.invYear=year;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getcarBrand(){
        return this.carBrand;
    }

    public int getinvYear(){
        return this.invYear;
    }

    public String getColor(){
        return this.color;
    }

    public static void main(String[] args) {

        Carmain obj=new Carmain();
       
       
        System.out.println(obj.getColor());
        System.out.println(obj.getcarBrand());
        System.out.println(obj.getinvYear());

    }
}
