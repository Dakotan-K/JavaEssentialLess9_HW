package addTask;

public class Mail {
    public static void main(String[] args) {

        Animal cat = new Animal("Барсик", 9, true);
        Animal dog = new Animal("Дружок", 5, true);
        Animal pig = new Animal("Фунтик", 2, false);

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(pig.toString());
    }
}
