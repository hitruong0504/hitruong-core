package Lab8;

public class Person {
    private String name;
    private int yearOfBirth;
    private String id;

    public Person(String name, int yearOfBirth, String id) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String toString() {
        return 
            " name='" + getName() + "'" +
            ", yearOfBirth='" + getYearOfBirth() + "'" +
            ", id='" + getId() + "'";
    }

}
