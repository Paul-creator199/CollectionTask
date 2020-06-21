import java.util.*;

public class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void returnList(ArrayList<User> user1, ArrayList<User> user2) {
        for (int i = 0; i <= user1.size(); i++) {
            for (int j = 0; j <= user2.size(); j++) {
                if (user1.get(i).equals(user2.get(j))) {
                    List<User> users = new ArrayList<>();
                    users.add(user1.get(i));
                    users.add(user2.get(j));
                    System.out.println(users);
                }
            }
        }
    }

    public void returnSet(Set<User> user1, Set<User> user2) {
        for (User user : user1) {
            for (User user3 : user2) {
                if ((user1.iterator().next()).equals((user2.iterator().next()))) {
                    Set<User> users = new HashSet<>();
                    users.add(user);
                    users.add(user3);
                    System.out.println(users);
                }
            }
        }
    }
}
