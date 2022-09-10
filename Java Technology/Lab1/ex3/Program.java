import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);

        // System.out.println("Sort by name using Comparator.");
        StudentUtils.sortByName(list);
        StudentUtils.print(list);

        // System.out.println("Sort by name using Lambda expression.");
        StudentUtils.sortByNameUsingLambdaExpression(list);
        StudentUtils.print(list);

        //System.out.println("Sort by avg using Comparator");
        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);
        
        //System.out.println("Sort by avg using Lambda Expression");
        StudentUtils.sortByAvgUsingLambdaExpression(list);
        StudentUtils.print(list);
        
        
        // @TODO: 
        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);

        // @TODO:
        System.out.print("Avg all students: ");
        System.out.println(StudentUtils.avg(list));
        // @TODO:
        System.out.print("List name of good students: ");
        System.out.println(StudentUtils.goodStudentName(list));
        
    }
}
