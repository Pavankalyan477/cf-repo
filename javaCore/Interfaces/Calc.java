public class Calc implements Operation, opeartion2 {
    void add(int a, int b) {
    }

    public int sub(int a, int b) {
        return a - b;

    }

    public int mul(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Calc op = new Calc();
        op.add(100, 20);

        System.out.println(op.sub(100, 20));
        System.out.println(op.mul(100, 20));

    }

}
