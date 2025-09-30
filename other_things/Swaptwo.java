package other_things;

public class Swaptwo {

    public static void main(String[] args) {
        Swaptwo s = new Swaptwo();
        s.withTemp(6, 5);
        s.withMath(6, 5);
    }

    // 1
    public void withTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    // 2
    public void withMath(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
