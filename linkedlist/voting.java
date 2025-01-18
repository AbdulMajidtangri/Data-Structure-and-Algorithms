public class voting {
    public static void main(String[] args) {
        int[] arr = { 1, 4,4, 4 };

        int count=0;

        int halflen = arr.length / 2;
       System.out.println(halflen);

        for (int i = 0; i < arr.length; i++) {
            count=1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    
                }
                if (count > halflen) {
                    System.out.println(count);
                    System.out.println("The winner is: " + arr[i]);
                    break;
                }
            }

        }
    }
}
