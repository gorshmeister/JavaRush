package core.level4.lection6.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя страна - " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц.";
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }
}
