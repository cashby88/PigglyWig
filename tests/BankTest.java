import static org.junit.Assert.*;

//Testing by MC Sotomayor, Valrico FL 2019

public class BankTest {
    private SavingsAccount savings = new SavingsAccount("Mary's Account");
    private CheckingAccount checking = new CheckingAccount("Mary's Account2");

    @org.junit.Test
    public void getNAME() throws exception {
        NAME name = new NAME("Mary");
        assertEquals("Mary" name.getNAME());

    }

    @org.junit.Test
    public void getAllAccounts() throws exception {
        assertEquals("Mary's Account", SavingsAccount, "Mary's Account2", CheckingAccount);
    }

    @org.junit.Test
    public void addCustomer() throws exception {
        assertEquals ("Mary", name.getNAME(), "Mary's Account", CustomerId());
    }

    @org.junit.Test
    public void removeCustomer() throws exception {
        assertEquals ("Mary", name.getNAME());
    }

    @org.junit.Test
    public void getCustomer() throws exception {
        assertEquals ("Mary", name.getNAME());
    }

    @org.junit.Test
    public void getCustomersAccounts() throws exception {
        assertEquals("Mary's Account", SavingsAccount, "Mary's Account2", CheckingAccount);
    }
}