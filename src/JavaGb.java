public class JavaGb {
    public static void main(String[] args) {
        System.out.println("Number 1. " + plus(1.5f,23.4f,3.2f,4.3f));
        System.out.println("Number 2. " + sum(10, 2));
        System.out.print("Number 3. ");
        porm(5);
        System.out.println("Number 4. " + torf(2));
        System.out.print("Number 5. ");
        name("Sofya!");
        System.out.print("Number 6. ");
        year(2020);
    }

    public static float plus(float a, float b, float c, float d)
    {
        return (a * (b + (c / d)));
    }

    public static boolean sum(int a, int b)
    {
        int c = a + b;
        if ((c <= 20) && (c >= 10))
        {
            return true;
        }
        else
            return false;
    }

    public static void porm(int i) {
        if (i >= 0) {
            System.out.println("Положительное число");
        } else if (i < 0) {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean torf(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void name(String c) {
        System.out.println("Привет, " + c);
    }

    public static void year(int x) {
        if (x % 100 != 0 || x % 400 == 0 && x % 4 == 0) {
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }
}
