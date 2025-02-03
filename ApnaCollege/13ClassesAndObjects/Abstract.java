public class Abstract {
  public static void main(String[] args) {
    Horse h = new Horse();
    Mustang myhorse = new Mustang();
    //Animal->Horse->Mustang
    h.eat();
    h.walk();
    System.out.println(h.color);
    Chicken c = new Chicken();
    c.eat();
    c.walk();
    // Animal a = new Animal();//error, can't instatiate
  }
}

abstract class Animal {
  Animal() {
    System.out.println("Animal Constructor called");
  }
  String color;
  void eat() {
    System.out.println("animal eat");
  }

  abstract void walk();
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse Constructor called");
  }

  void changeColor() {
    color = "black";
  }

  void walk() {
    System.out.println("Walk on 4 legs");
  }
}

class Mustang extends Horse {
  Mustang() {
    System.out.println("Mustang Constructor called");
  }
}

class Chicken extends Animal {
  void changeColor() {
    color = "Yellow";
  }
  void walk() {
    System.out.println("walk on two legs");
  }
}