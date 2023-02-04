public class View {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }

    public static void personView(Persona root){
        System.out.println( root.GetName()+" "+ root.GetGender()+" "+ root.GetAge() );
        for (var a: root.getListName()) {
            System.out.println(a.GetName()+" "+ a.GetGender()+" "+ a.GetAge());
        }
    }

    public static void bookView(Persona root){
        System.out.println("имя библиотеки " + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAuthor + " " + a.bTitle);
        }
    }

    public static void animalView(Persona root){
        System.out.println("животное:" + root.LPet.animal);
        for (var a: root.LPet.list) {
            System.out.println(a.bNickname + " " + a.bBreed+ " " + a.bAge);
        }
    }
}