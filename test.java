public class test {
  
  private Integer testInt = 0;

  public String execute() {
    if (testInt > 0) {
      testInt = testInt - 1;
    } else {
      testInt = 10;
    }
    
    return String.valueOf(testInt);
  }
}
