import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SortVisualizer1 extends JPanel {
    private int[] array;
    private int barWidth;
    private int delay;

    public SortVisualizer1(int[] array, int delay) {
        this.array = array;
        this.barWidth = Math.max(1, 800 / array.length);  // Ensure bars are visible even for larger arrays
        this.delay = delay;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i];
            g.setColor(Color.BLUE);
            g.fillRect(i * barWidth, getHeight() - barHeight, barWidth, barHeight);
        }
    }

    public void visualizeSort() {
        new Thread(() -> {
            mergesort(array,0, array.length-1);  // You can replace this with other sorts like insertionSort(), mergeSort(), etc.
        }).start();
    }
    private void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                    repaint();
                    sleep();
                }
            }
        }
    }
    private void insertionSort() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    swap(j, j - 1);
                    repaint();
                    sleep();
                }
            }
        }
    }
    private void selectionSort() {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] > array[index]) {
                   index = j;
                }
            }
            swap(i,index);
            repaint();
            sleep();
        }
    }
    private void mergesort(int arr[],int low,int high){
    int mid = (low + high) /2;
    if(low>= high) return;
    mergesort(arr, low, mid);
    mergesort(arr, mid+1, high);
merge(arr,low,mid,high);
    }
    private void merge(int arr[],int low,int mid,int high){ 
        int left = low;
        int right = mid +1;
        int []temp = new int[high - low +1];
        int k=0;
        while(left <= mid && right<= high){
            if(arr[left]<= arr[right]){
         temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i-low];
            }
    }
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void sleep() {
        try {
            Thread.sleep(delay);  // Slows down the sorting process for visualization
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Add other sorts like Insertion Sort, Merge Sort here

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500 + 10);
        }

        SortVisualizer1 visualizer = new SortVisualizer1(array, 60);
        frame.add(visualizer);
        frame.setVisible(false);

        visualizer.visualizeSort();
    }
}
