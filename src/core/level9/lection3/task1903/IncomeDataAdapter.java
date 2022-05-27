package core.level9.lection3.task1903;

import static core.level9.lection3.task1903.Solution.countries;

public class IncomeDataAdapter implements Customer, Contact {
    private IncomeData incomeData;

    public IncomeDataAdapter(IncomeData data) {
        this.incomeData = data;
    }

    @Override
    public String getName() {
        return String.format("firstName: %s, lastName: %s", incomeData.getContactFirstName(), incomeData.getContactLastName());
    }

    @Override
    public String getPhoneNumber() {
        return String.format("CountyCode: %s, Number: %s", incomeData.getCountryPhoneCode(), incomeData.getPhoneNumber());
    }

    @Override
    public String getCompanyName() {
        return incomeData.getCompany();
    }

    @Override
    public String getCountryName() {
        return countries.get(incomeData.getCountryCode());
    }
}
