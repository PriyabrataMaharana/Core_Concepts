package call_by_value;

public class CallByValueExample {

    static void modify(int num) {
        num = num + 10;
        System.out.println("Num = "+num);
    }

    public static void main(String[] args) {
        int x = 5;
        modify(x);
        System.out.println("Value of x after method call: " + x);
    }
}

