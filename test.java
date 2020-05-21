public class test {
  
  private Integer testInt = 0;
  
  private boolean testboolean = true;

  public String execute() {
    if (testInt > 0) {
      testInt = testInt - 1;
    } else {
      testInt = 10;
    }
    
    if (testboolean) {
      log.debug("true");
    }
    
    return String.valueOf(testInt);
  }
}
