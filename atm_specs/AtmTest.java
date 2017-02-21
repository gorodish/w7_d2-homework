import org.junit.*;
import static org.junit.Assert.assertEquals;
import atm_management.*;

public class AtmTest {

  Atm atm1;

  @Before 
  public void before() {
    atm1 = new Atm(1000, 250, "Grimsby High Street");
  }

  @Test
   public void hasLocation() {
     assertEquals("Grimsby High Street", atm1.getLocation());
   }

   @Test
   public void atmHasCash() {
    assertEquals(1000, atm1.getCash());
   }

   @Test
   public void atmHasMaxWd() {
    assertEquals(true, atm1.isWithinLimit(200));
    assertEquals(false, atm1.isWithinLimit(300));
   }

   @Test
   public void canDispense() {
    atm1.payOut(250);
    atm1.payOut(250);
    atm1.payOut(250);
    assertEquals(250, atm1.getCash());

    }
}