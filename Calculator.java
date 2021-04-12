//A simple program for a basic calculator making calculator

public class Calculator {
 
public Calculator(){

  }
  public int add(int a, int b){
   int sum = a + b;
    return sum;
  }
  public int subtract(int a,  int b){
   int total = a - b;
    return total;
  }
  public int multiply(int a, int b){
  int product = a * b;
  return product; 
  }
  public int divide(int a, int b){
    int divided = a/b ;
    return divided;
  }
  public int modulo(int a, int b){
    int modulod = a % b;
    return modulod;
  }
public static void main(String[] args){
  Calculator myCalulator = new Calculator ();

  System.out.println(myCalulator.add(5, 7));
  System.out.println(myCalulator.subtract(45, 11));
  System.out.println(myCalulator.multiply(4, 12));
}

}