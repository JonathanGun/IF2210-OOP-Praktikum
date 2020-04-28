// File AccountTest.java
public class AccountTest {
    public AccountTest() {
        // Tidak melakukan apa-apa
    }

    public void test() {
        // Melakukan tes terhadap method transfer.
        // Asumsikan method lainnya benar.
        Account a = AccountFactory.withBalance(20);
        Account b = AccountFactory.withBalance(10);
        assert a.getBalance() == (20);
        assert b.getBalance() == (10);
        assert a.getNumOfTransaction() == (0);
        assert b.getNumOfTransaction() == (0);
        try {
            a.transfer(b, 20);
            assert a.getBalance() == (0);
            assert b.getBalance() == (30);
            assert a.getNumOfTransaction() == (1);
            assert b.getNumOfTransaction() == (1);
            try {
                a.transfer(b, 15);
                assert false;
            } catch (InvalidAmountException e) {
                assert a.getBalance() == (0);
                assert b.getBalance() == (30);
                assert a.getNumOfTransaction() == (1);
                assert b.getNumOfTransaction() == (1);
            }
        } catch (InvalidAmountException e) {
            assert false;
        }
    }
}