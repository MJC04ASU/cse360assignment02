package cse360assignment02;

public class AddingMachine {
  private int total;
  private String totalMachine = new String("0");
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;    //output the current total
  }
  
  public void add (int value) {
    total += value;    //add the new value to the running total
    totalMachine = totalMaching.concat(" + ");   //add the '+' character to the end of the string.
    totalMachine = totalMaching.concat(Integer.toString(value));    //add the value to the end of the string.
  }

  public void subtract (int value) {
    total -= value;
    totalMachine = totalMaching.concat(" - ");    //add the '-' character to the end of the string.
    totalMachine = totalMaching.concat(Integer.toString(value));    //add the value to the end of the string.
  }

  public String toString () {
    return totalMachine;    //output the totalMachine string to string.
  }

  public void clear() {
    total = 0;    //reset the addingMaching
    totalMaching = new String("0"); //reset the totalMaching string
    
  }
}
