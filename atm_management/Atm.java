package atm_management;

public class Atm {

  private int cash;
  private int maxwd;
  private String location;

  public Atm(int cash, int maxwd, String location) {
    this.cash = cash;
    this.maxwd = maxwd;
    this.location = location;
  }

  public String getLocation() {
    return this.location;
  }

  public int getCash() {
    return this.cash;
  }

  public int getMaxWd() {
    return this.maxwd;
  }

  public void payOut(int cash) {
    this.cash -= cash;

}

  // public int fillUp() {

  // }
}