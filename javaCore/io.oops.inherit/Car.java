

public class Car extends Vehicle{
    int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static void main(String[] args) {
       // Vehicle obj=new Car();

        Car obj1=new Car();
        obj1.setWheels(4);
        obj1.setPower(5);
        System.out.println(obj1.getWheels());
        System.out.println(obj1.getPower());
    }
}