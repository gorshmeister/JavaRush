package core.level4.lection6.task1408;

class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
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
