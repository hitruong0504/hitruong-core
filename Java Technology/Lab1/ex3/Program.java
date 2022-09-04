import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<Student> list = StudentUtils.generate();
        // StudentUtils.print(list);

        // StudentUtils.sortByName(list);
        // StudentUtils.print(list);

        // StudentUtils.sortByNameUsingLambdaExpression(list);
        // StudentUtils.print(list);

       
        // StudentUtils.sortByAvg(list);
        // StudentUtils.print(list);

        // StudentUtils.sortByAvgUsingLambdaExpression(list);
        // StudentUtils.print(list);
        
        
        // @TODO: 
        // StudentUtils.sortByAgeDescending(list);
        // StudentUtils.print(list);

        // @TODO:
        System.out.println(StudentUtils.avg(list));
        // @TODO:
        // System.out.println(StudentUtils.goodStudentName(list));
        
    }
}
