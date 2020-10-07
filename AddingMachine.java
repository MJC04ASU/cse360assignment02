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
    totalMachine = totalMachine.concat(" + ");   //add the '+' character to the end of the string.
    totalMachine = totalMachine.concat(Integer.toString(value));    //add the value to the end of the string.
  }

  public void subtract (int value) {
    total -= value;
    totalMachine = totalMachine.concat(" - ");    //add the '-' character to the end of the string.
    totalMachine = totalMachine.concat(Integer.toString(value));    //add the value to the end of the string.
  }

  public String toString () {
    return totalMachine;    //output the totalMachine string to string.
  }

  public void clear() {
    total = 0;    //reset the addingMaching
    totalMachine = new String("0"); //reset the totalMaching string
    
  }

  public static void main(String[] args) {
    
    AddingMachine myCalculator = new AddingMachine();

    myCalculator.add (4);
    myCalculator.subtract (2);
    myCalculator.add (5);
    
    System.out.println(myCalculator);
    System.out.println(myCalculator.getTotal());
  }
    
}
