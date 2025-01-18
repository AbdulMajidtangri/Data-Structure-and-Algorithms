public class interrsection {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2 };
        int brr[] = { 2, 5 ,3};
        int ocr = 0;
        int count = 0;
        int demo[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int k = 0; k < ocr; k++) {
                if (demo[k] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                for (int j = 0; j < brr.length; j++) {
                    if (arr[i] == brr[j]) {
                        demo[ocr] = arr[i];
                        ocr++;
                    }
                }
            }

        }
        for (int i = 0; i < ocr; i++) {
            System.out.print(demo[i] + " ");
        }
    }
}