package core.level5.lection12.task1530;

public class TeaMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        super.pour();
        System.out.println("Заказ готов..............................");
    }
}
