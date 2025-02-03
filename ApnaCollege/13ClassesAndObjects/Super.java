public class Super {
  public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
  }
}

class Animal {
  String color;
  Animal() {
    System.out.println("Animal constructor is called");
  }
}

class Horse extends Animal {
  Horse() {
    super();//call Animal constructor, if not written then super is used by default by compiler.
    super.color = "brown";//access the parent property
    System.out.println("horse constructor is called");
  }
}