import java.util.Comparator;

public class SortByAverageAsc implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getAvg() > student2.getAvg()) return 1;
        if(student1.getAvg() < student2.getAvg()) return -1;
        return 0;
    }
}
