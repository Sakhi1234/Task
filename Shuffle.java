import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        // Shuffle the array
        Collections.shuffle(arr);

        // Print the array
        System.out.println(arr);
    }
}
