public class challenge {
    int data;
    challenge next;

    challenge(int data) {
        this.data = data;
    }

    challenge(int data, challenge next) {
        this.data = data;
        this.next = next;
    }

    public static challenge insert(int value, challenge start) {
        challenge temp = start;
        if (start == null || start.data > value) {
            start = new challenge(value, start);
            return start;
        }
        while (temp.next != null) {
            if (temp.next.data > value)
                break;
            temp = temp.next;
        }
        temp.next = new challenge(value, temp.next);
        return start;
    }

    public static challenge insertdecen(int value, challenge start) {
        challenge temp = start;
        if (start == null || start.data < value) {
            start = new challenge(value, start);
            return start;
        }
        while (temp.next != null) {
            if (temp.next.data < value)
                break;
            temp = temp.next;
        }
        temp.next = new challenge(value, temp.next);
        return start;
    }

    public static void printlist(challenge head) {
        challenge temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void lltoarr(challenge start) {
        challenge temp = start;
        int count = 0;
        while (temp  !=  null) {
            temp = temp.next;
            count++;
        }
        System.out.println("the total value aree :" + count);
        int arr[] = new int[count];
        temp = start;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.data;
            temp = temp.next;
            i += 1;
        }
        System.out.println("The Elements Are Stored IN the array");
        for (int r : arr) {
            System.out.print(r + " ");
        }
        System.out.println();
        temp = start;
        System.out.println("The Elelemnets in The List arr");
        for (int in = arr.length - 1; in >= 0; in--) {
            challenge h = insertdecen(arr[in],temp);
            System.out.print(h.data + " ");
        }
    }

    public static void main(String[] args) {
        challenge n = new challenge(2);
        for(int i=0;i<=5;i++){
          n = challenge.insert(3+i, n);
        }
        challenge.printlist(n);
        challenge.lltoarr(n);
    }
}
