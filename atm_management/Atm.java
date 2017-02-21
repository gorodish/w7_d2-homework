package atm_management;

public class Atm {

  private int cash;
  private int maxwd;
  private String location;

  public Atm(int cash, int maxwd, String location) {
    this.cash = cash;
    this.maxwd = 250;
    this.location = location;
  }

  public String getLocation() {
    return this.location;
  }

  public int getCash() {
    return this.cash;
  }

  public boolean isWithinLimit(int cash) {
    return cash <= this.maxwd;
  }

  public int payOut(int cash) {
    if (isWithinLimit(cash) && this.cash >= cash) {
      this.cash -= cash;
      return cash;
    } else {
      return 0;
    }
} 
}