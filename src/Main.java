import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        User user1 = new User("Vasiliy", 17);
        User user2 = new User("Vasiliy", 17);
        User user3 = new User("Ilona", 16);
        List<User> list1 = new ArrayList<>();

        list1.add(user1);
        list1.add(user2);
        list1.add(user3);
        Collections collections = new Collections();
        System.out.println("List: выводя на консоль информацию в виде: <индекс>: <элемент>");
        collections.listIterate(list1);

        System.out.println(" ");


        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        System.out.println("HashSet: выводя на консоль информацию в виде: <элемент>");
        collections.setIterate(set);

        System.out.println(" ");


        Map<Integer, User> map = new HashMap<>();
        map.put(1, user1);
        map.put(2, user2);
        map.put(1, user3);
        map.put(3, user1);
        System.out.println("Map: итерация по значениям: <значение>");
        collections.mapIterateValue(map);

        System.out.println(" ");

        System.out.println("Map: итерация по ключам: <ключ>: <значение>");
        collections.mapIterateKey(map);
        System.out.println(" ");

        System.out.println("Map: итерация по парам: <ключ>: <значение>");
        collections.mapIteratePair(map);

    }

}


