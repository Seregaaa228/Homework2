package Dogs;


public class DogMain {
    public static void main(String[] args) {
        Dog mark = new Dog("Марк", 5, 4, "Питбуль");
        mark.document();
        System.out.println("-------------");
        Dog tom = new Dog("Том", 5, 7, "Лабрадор");
        tom.document();
        System.out.println();
        mark.dogComparison(tom);


    }
}
