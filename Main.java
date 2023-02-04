public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Михаил", "мужской",44, "№10","собака");
        Persona son = new Persona("Алексей", "мужской", 20, "№11","кошка");

        papa.PersLibr.AddBook("Федор Михайлович Достоевский", "Преступление и наказание", "RU");
        son.PersLibr.AddBook("Николай Васильевич Гоголь", "Мертвые души", "RU");

        papa.LPet.AddAnimal("Пиларина", "дог", 5);
        son.LPet.AddAnimal("Мася", "шотландец", 11);


        System.out.println("-".repeat(10));
        View.personView(papa);
        View.bookView(papa);
        View.animalView(papa);
        System.out.println("-".repeat(10));
        View.personView(son);
        View.bookView(son);
        View.animalView(son);
    }
}