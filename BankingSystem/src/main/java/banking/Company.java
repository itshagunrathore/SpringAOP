package banking;

public class Company {
    private String companyName;
    private int taxID;

    public Company(String companyName, int taxId) {
        this.companyName = companyName;
        this.taxID = taxId;
    }

    public String getCompanyName() {
        // complete the function
        return companyName;
    }

    public int getTaxID() {
        return taxID;
    }
}
