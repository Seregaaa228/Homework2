package Dogs;


public class DogMain {
    public static void main(String[] args) {
        Dog mark = new Dog("Марк", 5, 4, "Питбуль");
        mark.document();
        System.out.println("-------------");
        Dog tom = new Dog("Том", 5, 7, "Лабрадор");
        tom.document();
        System.out.println();
        if (mark.equalsAge(tom) && mark.equalsWeight(tom)) {
            System.out.println("Возраст одинаковый и Вес одинаковый");
        } else if (mark.equalsAge(tom)) {
            System.out.println("Одинаковый возраст");
        } else if (mark.equalsWeight(tom)) {
            System.out.println("Одинаковый вес");
        } else {
            System.out.println("Ничего не одинаково");
        }


    }
}
