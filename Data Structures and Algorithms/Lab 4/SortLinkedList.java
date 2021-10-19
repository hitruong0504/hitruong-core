import java.util.Comparator;

public class SortLinkedList implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAvg() > o2.getAvg()) return 1;
        if(o1.getAvg() < o2.getAvg()) return -1;
        return 0;
    }
}
