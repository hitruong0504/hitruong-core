public class Person {
    String name;
    int priority;

    public Person(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public String toString(){
        return name + ", " + priority;
    }
}
