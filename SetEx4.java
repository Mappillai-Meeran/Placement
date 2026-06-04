import java.util.*;

public class SetEx4 {
    public static void main(String args[]) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // retainAll() keeps only elements that are also in setB
        setA.retainAll(setB);

        System.out.println("Intersection: " + setA);
    }
}
