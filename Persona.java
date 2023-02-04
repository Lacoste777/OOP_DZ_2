import java.util.ArrayList;


public class Persona extends Human {
    public Library PersLibr;
    public Pet LPet;

    public Persona(String Name, String Gender, int Age, String persLibr, String pet) {
        SetGender(Gender);
        SetName(Name);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
        this.LPet = new Pet(pet);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();
        System.out.println("Меня зовут " + name);
    }

    public void pBook(){

    }
}