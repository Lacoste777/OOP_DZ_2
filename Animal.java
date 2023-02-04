public class Animal {
    private String nickname;
    private String breed;
    private int age;

    public void SetNicname(String nick){
        this.nickname=nick;
    }
    public void SetBreed(String breed){
        this.breed=breed;
    }
    public void SetAge(int age){
        this.age=age;
    }

    public String GetNickname(){
        return nickname;
    }
    public String GetBreed(){
        return breed;
    }
    public int GetAge(){
        return age;
    }
}