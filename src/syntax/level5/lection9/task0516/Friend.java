package syntax.level5.lection9.task0516;

/*
Nabiraem kod
private String filename = null;

    public MyFile(String name) {
        this.filename = name;
    }

    public MyFile(String name, String folder) {
        this.filename = folder + name;
    }

    public MyFile(MyFile file, String name) {
        this.filename = file.getFolder() + name;
    }
*/



public class Friend {

    String name;
    int age;
    char sex;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
