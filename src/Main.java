import java.util.*;

public class Main {
    public static void main(String[] args) {

        //3.  Создайте ArrayList с несколькими элементами (используя дубликаты)
        // и проитерируйтесь по нему, выводя на консоль информацию в виде: <индекс>: <элемент>
        User user1 = new User("Vasiliy", 17);
        User user2 = new User("Vasiliy", 17);
        User user3 = new User("Ilona", 16);
        List<User> list1 = new ArrayList<>();
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);

        for (User user : list1) {
            System.out.println(list1.indexOf(user) + " " + user);
        }

//4.  Создайте HashSet с несколькими элементами (используя дубликаты)
// и проитерируйтесь по нему, выводя на консоль информацию в виде: <элемент>
        String one = "aaaa";
        String two = "aaaa";
        String three = "bbbb";
        Set<String> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //5.  Создайте HashMap с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
        // выводя на консоль информацию в виде:

        Map<Integer, String> map = new HashMap<>();
        final Set<Integer> keySet = map.keySet();
        final Collection<String> values = map.values();
        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        map.put(1, "Last of Us");
        map.put(2, "The Witcher 3");
        map.put(1, "Last of Us");
        map.put(3, "The Witcher 3");

        //итерация по значениям: значение
        for (String value : values) {
            System.out.println("value: " + value);
        }

        //итерация по ключам: <ключ>: <значение>
        for (Integer key : keySet) {
            for (String value : map.values())
                System.out.println("key: " + key + " " + "value" + " " + value);
        }

        //итерация по парам: <ключ>: <значение>
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }

}

