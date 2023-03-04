import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static String odd(List listNames){
        StringBuilder stringBuilder = new StringBuilder();
/*В наступному рядку можна змінити початкове значення "i". Якщо потрібно виводити імена саме за ІНДЕКСОМ, тоді 1.
* Але якщо вважати, що ім'я під індексом 0 в List ПЕРШЕ - тоді змінюємо значення на 0 та дописуємо в наступних рядках +1.  */
        for (int i = 1; i < listNames.size(); i=i+2) {
            if(i>listNames.size()-1){
                stringBuilder.append(i + ". "+ listNames.get(i));
            }else stringBuilder.append(i + ". "+ listNames.get(i)+", ");
        }
        return stringBuilder.toString();
    }
    public static List<String> sortFromZtoA(List<String> listNames){
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        return listNames
                .stream()
                .map(String::toUpperCase)
                .sorted(reverseComparator)
                .collect(Collectors.toList());
    }
}
