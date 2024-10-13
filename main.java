import java.util.Random;

public class main {
    public static void main(String[] args) {
        long l = 123456L;
        double d1, d2;
        float f = 14.75f;
        char c1 = '0';

        // 1. Присвоєння значення змінної f змінній l
        l = (long) f;  // Перетворення типу float до long
        System.out.println("Значення l після присвоєння f: " + l);

        // 2. Присвоєння випадкових значень для d1 та d2
        Random rand = new Random();
        d1 = 100 + rand.nextDouble() * 900; // випадкове значення в діапазоні від 100 до 1000
        d2 = 1 + rand.nextDouble() * 98;    // випадкове значення в діапазоні від 1 до 99

        System.out.println("Випадкове значення d1: " + d1);
        System.out.println("Випадкове значення d2: " + d2);
    }
}

