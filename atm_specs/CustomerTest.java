import org.junit.*;
import static org.junit.Assert.assertEquals;
import atm_management.*;

public class CustomerTest {

  Atm atm1;
  Customer customer1;

  @Before 
  public void before() {
    atm1 = new Atm(1000, 250, "Grimsby High Street");
    customer1 = new Customer("Dave", 1000);
  }

   @Test
   public void customerHasName() {
    assertEquals("Dave", customer1.getName());
   }

   @Test
   public void canWithdrawCash() {
    customer1.withdrawCash(100, atm1);
    assertEquals(900, customer1.getWallet());
    assertEquals(900, atm1.getCash());

   }
}