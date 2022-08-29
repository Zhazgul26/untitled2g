import HomeWork19.DayOfWeek;

import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();
        DayOfWeek days = DayOfWeek.valueOf(a);

        switch (days){
            case MONDAY -> System.out.println("Дуйшомбу куну жава окуйм ");
            case TUESDAY -> System.out.println("Шейшемби куну англис-тили сабагын окуйм");
            case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм  ");
            case THURSDAY -> System.out.println("Бейшемби куну турк-тили сабагын окуйм ");
            case FRIDAY -> System.out.println("Жума куну жава окуйм ");
            case SATURDAY -> System.out.println("Ишемби куну англис-тили сабагын окуйм ");
            case SUNDAY -> System.out.println("Жекшемби куну мен эс алам ");

        }
    }

    }

