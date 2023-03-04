import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyArray {
    public static void sortedNumbers(String[] nums) {
        List<String> strings = new ArrayList<String>();
        for (String s : nums) {
            Collections.addAll(strings, s.split(", "));
        }
        List<String> filteredNums= strings
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNums);
    }
}
