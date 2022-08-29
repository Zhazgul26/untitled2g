package HomeWork;

public class Apartment implements Arenda {
    private Person [] family;
    private String name;

    public Apartment (Person [] family){
        this.family = family;
        this.name = name;

    }
    @Override
    public void utilites() {
        for (Person person : family) {

            System.out.println(person);
        }

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

