import java.util.*;

public class Main {
    public static void main(String[] args) {

       LinkedList<User> userList = new LinkedList<>(Arrays.asList(
               new User(77, "Meder", 23),
               new User(43, "Timur", 18),
               new User(32, "Nooruz", 21)
       ));

        System.out.println("BEFORE SORTING:");
        System.out.println(userList);
        System.out.println("AFTER SORTING;");
        Collections.sort(userList, comparatorByAge);
        System.out.println(userList);

        System.out.println(userList.get(1));
    }

    static Comparator<User> comparatorByAge = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o2.getAge() - o1.getId();
        }
    };

    static Comparator<User> comparatorName = Comparator.comparing(User::getName);
}