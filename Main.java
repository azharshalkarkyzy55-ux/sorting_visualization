import java.util.Arrays;
public class Main {

    
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
        try {
            Thread.sleep(300); // кішкене пауза
        } catch (Exception e) {
        }
    }

    // Bubble sort
    public static void bubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
                printArray(a);
            }
        }
    }

    // Selection sort
    public static void selection(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;

            printArray(a);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {9, 3, 6, 1};

        System.out.println("Bubble:");
        bubble(numbers.clone());

        System.out.println("Selection:");
        selection(numbers.clone());
    }
}
