public class Oops {
  public static void main(String[] args) {
    Fish tuna = new Fish();
    Dog dobby = new Dog();
    tuna.eat();
    tuna.breadth();
    tuna.swim();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
  }
}

class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breadth() {
    System.out.println("breadth");
  }
}

class Mammal extends Animal {
  int legs;

  void walk(){
    System.out.println("walks");
  }
}

class Dog extends Mammal {
  String breed;
}

class Fish extends Animal {
  int fins;
  void swim() {
    System.out.println("Swims in water");
  }
}

