import java.util.*;
import java.util.Collections;

public class use_comparator {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("NEHA",151));
        list.add(new Student("NAMAN",152));
        list.add(new Student("RIYA",52));
        list.add(new Student("RISHIKA",272));
        list.add(new Student("RITIKA",15));
        System.out.println("----student_list--\n"+list);
        Collections.sort(list);
        System.out.println("----sorted according to roll_num--\n"+list.toString());
        Collections.sort(list,new name_sorted());
        System.out.println("----sorted according to name--\n"+list.toString());
    }
}
class Student1 implements Comparable<Student> {
    String name;
    int roll_num;

    public Student1(String name, int roll_num) {
        this.name = name;
        this.roll_num = roll_num;
    }
    public String toString()
    {
        return this.roll_num +" "+name;
    }

    public int compareTo(Student s1) {
        return this.roll_num - s1.roll_num;
    }
}
class name_sorted implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}