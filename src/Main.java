import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0 ,32, 3, 5, 8 ,23, 4);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++){
            int tmp = intList.get(i);
            if (tmp > 0 && tmp % 2 == 0){
                result.add(tmp);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
