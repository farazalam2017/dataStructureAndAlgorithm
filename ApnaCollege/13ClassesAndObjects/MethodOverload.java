public class MethodOverload {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Deer d = new Deer();
    d.eat();
    System.out.println(calc.sum(1, 2));
    System.out.println(calc.sum((float)1, (float)2));
    System.out.println(calc.sum(1, 2,3));
  }
}

class Animal {
  void eat() {
    System.out.println("eats anything");
  }
}

class Calculator {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}

class Deer extends Animal {
  void eat() {
    System.out.println("eat grass");
  }
}
