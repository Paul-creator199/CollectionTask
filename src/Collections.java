import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Collection;

public class Collections {

    public List<Object> returnList(List<User> user1, List<User> user2) {
        if (user1.contains(user2)) {
            List<Object> listOfCommons = new ArrayList<>(user1);
            return listOfCommons;
        }
        return null;
    }

    public Set<Object> returnSet(Set<User> user1, Set<User> user2) {
        if (user1.retainAll(user2)) {
            Set<Object> set = new HashSet<>(user1);
            return set;
        }
        return null;
    }

    public void listIterate(List<User> list) {
        for (User user : list) {
            System.out.println("indext: " + list.indexOf(user) + ", user: " + user);
        }
    }

    public void setIterate(Set<User> set) {
        for (User user : set) {
            System.out.println("user: " + user);
        }
    }

    public void mapIterateValue(Map<Integer, User> map) {
        final Collection<User> values = map.values();
        for (User user : values) {
            System.out.println("user: " + user);
        }
    }

    public void mapIterateKey(Map<Integer, User> map) {
        final Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            User user = map.get(key);
            System.out.println("key: " + key + ", user: " + user);
        }
    }

    public void mapIteratePair(Map<Integer, User> map) {
        final Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for (Map.Entry<Integer, User> entry : entries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }

}
