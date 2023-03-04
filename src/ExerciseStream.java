import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseStream {
    public static Stream<Long> endlessStream(long a, long c, long m){
        return Stream.iterate(0L, x -> ((a * x) + c) % m);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> list = new ArrayList<T>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while(iterator1.hasNext() && iterator2.hasNext()){
            list.add(iterator1.next());
            list.add(iterator2.next());
        }
        return list.stream();
    }
}
