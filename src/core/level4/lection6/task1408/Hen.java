package core.level4.lection6.task1408;

abstract class Hen implements Country {

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }

    private String country;

    public void Hen(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}