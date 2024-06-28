import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personal_40 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6, 4};
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        list.forEach(o->sb.append(o).append(", "));
            sb.setLength(sb.length() - 2);

        System.out.print(sb);

    }
}




