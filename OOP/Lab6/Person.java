package Lab6;

public class Person {
    private String name;
    private String address;

    //construct

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //methods

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

}
