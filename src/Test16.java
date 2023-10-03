import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test16 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"冷静","专注a","认真啊");
        //list.stream().filter(s -> s.length()==2).forEach(s -> System.out.println(s));
        Integer[] arr = Stream.of(1, 2, 3, 4, 5).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(arr));
    }
}
