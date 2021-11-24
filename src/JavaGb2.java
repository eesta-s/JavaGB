public class JavaGb2 {
    public static void main(String[] args) {
        System.out.print("Number 1. ");
        mas();
        System.out.print("\nNumber 2. ");
        all();
        System.out.print("\nNumber 3. ");
        big();
        System.out.println("\nNumber 4. ");
        two();
    }

    public static void mas() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void all() {
        int[] arr = new int[7];
        int c = 3;

        for (int i = 0; i < arr.length; i++) {
            arr[i] += c;
            c += 3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void big() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void two() {
        int c = 1;
        int[][] ms = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ms[i][j] = c;
                System.out.print(ms[i][j] + " ");
                c++;
            }
            System.out.println();
        }
    }
}
