package HomeWork18;

public class Hostel implements Arenda {
    private Person[] family;
    private  String name;

    public Hostel(Person[] family) {
        this.family = family;
        this.name = name;

    }

    @Override
    public void utilites() {
        System.out.println("Биз оренда толойбуз ");
    }

    @Override
    public void arenda() {

    }

    public Person[] getFamily() {
        System.out.println("Отелде жашаган адамдар ");
        for (Person person :family) {
            System.out.println(person);

        }
        return family;
    }

    @Override
    public String toString() {
        return name;


        }

    public void getFamimly() {

    }
}



