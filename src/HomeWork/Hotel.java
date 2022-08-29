package HomeWork;

public class Hotel implements Utilites {
    private Person [] family;

    public Hotel (Person [] family){
        this.family = family;

    }
    @Override
    public void utilites() {
        System.out.println("Биз оренда толойбуз ");
        for (Person person:family) {
            System.out.println(person);
        }
    }
    public void getFamily(){
        System.out.println("Отелде жашаган адамдар ");
        for (Person person:family) {
            System.out.println(person);
        }
    }

    public void getFamimly() {

    }
}
