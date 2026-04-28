import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // массив өлшемі
        int[] arr = new int[n];

        // элементтерді енгізу
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ең үлкен элементті табу
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // нәтижені шығару
        System.out.println(max);
    }
}
