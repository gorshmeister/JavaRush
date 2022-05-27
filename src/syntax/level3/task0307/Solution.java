package syntax.level3.task0307;

public class Solution {
    public static void main(String[] args) {
        Zerg Zerg1 = new Zerg();
        Zerg Zerg2 = new Zerg();
        Zerg Zerg3 = new Zerg();
        Zerg Zerg4 = new Zerg();
        Zerg Zerg5 = new Zerg();
        Zerg1.name = "Pidor1";
        Zerg2.name = "Pidor2";
        Zerg3.name = "Pidor3";
        Zerg4.name = "Pidor4";
        Zerg5.name = "Pidor5";

        Protoss Protoss1 = new Protoss();
        Protoss Protoss2 = new Protoss();
        Protoss Protoss3 = new Protoss();
        Protoss1.name = "Ebloid1";
        Protoss2.name = "Ebloid2";
        Protoss3.name = "Ebloid3";

        Terran Terran1 = new Terran();
        Terran Terran2 = new Terran();
        Terran1.name = "Zalupa1";
        Terran2.name = "Zalupa2";
    }

    public static class Zerg {
        public String name;
    }
    public static class Protoss {
        public String name;
    }
    public static class Terran {
        public String name;
    }
}
