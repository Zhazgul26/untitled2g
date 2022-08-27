package HomeWork18;

public class Person {
    private String name;
public  Person(String name ){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
