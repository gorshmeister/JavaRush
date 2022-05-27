package syntax.level5.lection9.task0526;

public class Solution {
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static void main(String[] args) {
        Man man1 = new Man("Igorek", 23, "Ekaterinburg");
        Man man2 = new Man("Olegik", 22, "Saint-P");
        Woman woman1 = new Woman("Oksana", 20, "N.Novgorod");
        Woman woman2 = new Woman("Ksenia", 22, "Chelyabinsk");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

}
