

public class Vehicle{

    int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        Vehicle data=new Vehicle();
        System.out.println(data.getWheels());
    }
}