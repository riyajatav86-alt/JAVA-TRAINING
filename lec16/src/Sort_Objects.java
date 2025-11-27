import java.util.*;

public class Sort_Objects {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("riya",274));
        list.add(new Student("tiya",271));
        list.add(new Student("piya",254));
        list.add(new Student("jiya",264));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
class Student implements Comparable<Student> {
    String name;
    int roll_num;

    public Student(String name, int roll_num) {
        this.name = name;
        this.roll_num = roll_num;
    }

    public int compareTo(Student s1) {
        return this.roll_num - s1.roll_num;
    }

    public String toString() {
        return roll_num + " " + name;
    }
}



