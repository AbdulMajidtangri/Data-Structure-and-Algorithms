import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String s[] = { "swift", "Ruby", "html", "CSS", "JS", "Cpp", "Java" };
        int arr[] = { 4, 6, 5, 1, 0, 3, 2 };
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        for (int i = 0; i < s.length; i++) {
            if ( in.equals(s[i])) {
              s[i] = "The "+s[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(s[arr[y]] + " ");
        }
    }
}
