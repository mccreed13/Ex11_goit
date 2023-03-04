import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<String>();
        listNames.add("Ivan");
        listNames.add("Volodymyr");
        listNames.add("Anton");
        listNames.add("Olga");
        listNames.add("Sophia");
        listNames.add("Darina");

        System.out.println(SortList.odd(listNames));
        System.out.println(SortList.sortFromZtoA(listNames));

        String[] nums = {"1, 2, 0", "4, 5"};
        MyArray.sortedNumbers(nums);

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        ExerciseStream.endlessStream(a, c, m);

        Stream<Integer> integerStream = Stream.of(1,2,3,4);
        Stream<Integer> integerStream2 = Stream.of(11,22,33);
        System.out.println(Arrays.toString(ExerciseStream.zip(integerStream, integerStream2).toArray()));
    }
}
