package ua.com.alevel;
import ua.com.alevel.test.Message;

public class Hello {

    public static void main(String[] args) {
        Message m = new Message();
        byte b = Byte.MAX_VALUE;
        byte b1 = Byte.MIN_VALUE;
        short s = Short.MAX_VALUE;
        short s1 = Short.MIN_VALUE;
        int i = Integer.MAX_VALUE;
        int i1 = Integer.MIN_VALUE;
        long l = Long.MAX_VALUE;
        long l1 = Long.MIN_VALUE;

        m.print(String.valueOf(b));
        m.print(String.valueOf(b1));
        m.print(String.valueOf(s));
        m.print(String.valueOf(s1));
        m.print(String.valueOf(i));
        m.print(String.valueOf(i1));
        m.print(String.valueOf(l));
        m.print(String.valueOf(l1));
    }
}
