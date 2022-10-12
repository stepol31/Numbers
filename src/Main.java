import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer <= 0) {
                iterator.remove();
            }
        }

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 != 0) {
                intList.remove(i);
                i--;
            }
        }

        Collections.sort(intList);
        System.out.println(intList);
    }

}
