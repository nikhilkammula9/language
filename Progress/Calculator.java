public class Calculator{

public Calculator()
{

}

public int add(int a,int b){
  int sum = a + b;
  return sum;
}
public int subtract(int a,int b){
  int difference = a - b;
  return difference;
}
public int multiply(int a,int b){
  int product = a * b;
  return product;
}
public int divide(int a,int b){
  int division = a /b;
  return division;
}
public int modulo(int a,int b){
  int mod = a % b;
  return mod;
}

public static void main(String[] args){
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(1,2));
  System.out.println(myCalculator.subtract(3,2));
  System.out.println(myCalculator.multiply(4,5));
  System.out.println(myCalculator.divide(7,7));
  System.out.println(myCalculator.modulo(8,7));
}
}
