import java.util.*;
public class Typecast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a = 25.12f;
    int b = (int) a;//lossy conversion
    System.out.println(b);
    sc.close();
  }
}
