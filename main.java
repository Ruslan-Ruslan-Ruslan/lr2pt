import java.util.Random;

public class main {
    public static void main(String[] args) {
        long l = 123456L;
        double d1, d2;
        float f = 14.75f;
        char c1 = '0';

        l = (long) f;

        Random rand = new Random();
        d1 = 100 + rand.nextDouble() * 900;
        d2 = 1 + rand.nextDouble() * 98;

        double y = (Math.sqrt(d1) - Math.cbrt(d2)) / ((l - d1) * (l * l + d2));

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("l = " + l);
        System.out.println("Значення y = " + y);
        
    }
}




