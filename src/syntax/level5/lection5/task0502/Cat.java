package syntax.level5.lection5.task0502;

// fight cat
public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
/*
        int cnt1 = 0, cnt2 = 0;

        if (this.age > anotherCat.age) {
            cnt1++;
        } else if (this.age == anotherCat.age) {
            cnt1 += 0;
            cnt2 += 0;
        } else
            cnt2++;

        if (this.weight > anotherCat.weight) {
            cnt1++;
        } else if (this.weight == anotherCat.weight) {
            cnt1 += 0;
            cnt2 += 0;
        } else
            cnt2++;

        if (this.strength > anotherCat.strength) {
            cnt1++;
        } else if (this.strength == anotherCat.strength) {
            cnt1 += 0;
            cnt2 += 0;
        } else
            cnt2++;

        if (cnt1 == cnt2) {
            return false;
        } else if (cnt1 > cnt2) {
            return true;
        } else
            return false;
*/

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        cnt1 = this.age > anotherCat.age ? +1 : -1;

        cnt2 = this.weight > anotherCat.weight ? +1 : -1;

        cnt3 = this.strength > anotherCat.strength ? +1 : -1;

        int win = cnt1 + cnt2 + cnt3;

        if (win > 0) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 1;
        cat.weight = 10;
        cat.strength = 17;

        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.weight = 10;
        cat1.strength = 10;

        System.out.println(cat.fight(cat1));
    }
}
