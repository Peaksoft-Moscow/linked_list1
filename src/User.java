import java.util.Comparator;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private int age;


    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name); // здесь идет сортировка по строчному полю
    }

//    @Override
//    public int compareTo(User o) {
////        return id - o.id; // по возрастанию
//        return o.id - id; // по убыванию
//    }

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
