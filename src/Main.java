import HomeWork18.Apartment;
import HomeWork18.Hostel;
import HomeWork18.Hotel;
import HomeWork18.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("   Палина ");
        Person person2 = new Person("     Вика ");
        Person person3 = new Person("     Катя ");
        Person person4 = new Person("      Оля ");
        Person person5 = new Person("     Эмма ");
        Person person6 = new Person("    Данил ");
        Person person7 = new Person("   Деннис ");
        Person person8 = new Person("    Алекс ");
        Person person9 = new Person("    Федик ");
        Person person10 = new Person("Екетерина");
        Person person11 = new Person("   Любовь");
        Person person12 = new Person("     Аня ");
        Person person13 = new Person("   Алина ");
        Person person14 = new Person("     Саша ");
        Person person15 = new Person("   Керил ");


        Person[] family1 = {person1, person2, person3, person4, person5};
        Person[] family2 = {person11, person12, person13, person14, person15};
        Person[] family3 = {person6, person7, person8, person9, person10};
        Hotel hotel = new Hotel(family1);
        Hostel hostel = new Hostel(family3);
        Apartment apartment = new Apartment(family2);
       hostel.utilites();
       hostel.getFamimly();
       hotel.utilites();
       hotel.getFamimly();
        apartment.utilites();
        apartment.arenda();
        hotel.getFamily();
        hostel.getFamily();
        apartment.getFamily();
    }

    }
