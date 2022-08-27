package HomeWork18;

public class Apartment implements Arenda {
    private Person [] family;
    private String name;

    public Apartment (Person [] family){
        this.family = family;
        this.name = name;

    }
    @Override
    public void utilites() {
        System.out.println("Биз оренда толойбуз ");
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void arenda() {

    }

    public void getFamily(){
        System.out.println("Отелде жашаган адамдар ");
        for (Person person:family) {
            System.out.println(person);
            person.getName();
        }
        
        }
    }

