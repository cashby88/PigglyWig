import static org.junit.Assert.*;



public class AccountTest {



    @org.junit.Test
    public void transfer() throws exception {
    }   SavingsAccount savings = new SavingsAccount("Mary's Account");
        assertEquals("Mary's Account", savings.getAccountID(), savings.getCustomerId());

    @org.junit.Test
    public void getBalance() throws exception {
        double Balance;
                assertNotNull( Balance);
    }

    @org.junit.Test
    public void getAccountId() throws exception {
        AccountId account = new Account("Mary's Account");
        assertEquals(AccountId());

    }

    @org.junit.Test
    public void getCustomerId() throws exception {
        CustomerId customer = new Customer("Mary's Account");
        assertEquals("Mary's Account", CustomerId);
    }


    @org.junit.Test
    public void equals() throws exception {
        assertEquals("Mary's Account", AccountId(), CustomerId());
    }
}