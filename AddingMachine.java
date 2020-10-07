package cse360assignment02;

public class AddingMachine {
  private int total;
  private String totalMachine;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total += value;
    totalMachine = totalMaching.concat(" + ");
    totalMachine = totalMaching.concat(Integer.toString(value));
  }

  public void subtract (int value) {
    total -= value;
    totalMachine = totalMaching.concat(" - ");
    totalMachine = totalMaching.concat(Integer.toString(value));
  }

  public String toString () {
    return totalMachine;
  }

  public void clear() {
    total = 0;
    totalMaching = new String("");
    
  }
}
