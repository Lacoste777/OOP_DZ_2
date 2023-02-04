import java.util.ArrayList;

class Animals{
    public String bNickname;
    public String bBreed;
    public int bAge;
}

public class Pet extends Animal {
    public String animal;
    public Pet  (String nameAnimal){
        this.animal=nameAnimal;
    }

    ArrayList<Animals> list = new ArrayList<>();

    public void AddAnimal(String name, String breed, int age){
        Animals a = new Animals();
        SetNicname(name);
        SetBreed(breed);
        SetAge(age);
        a.bNickname= GetNickname();
        a.bBreed = GetBreed();
        a.bAge =GetAge();
        list.add(a);
    }

    public ArrayList<Animals> getAnimalList(){
        return list;
    }
}