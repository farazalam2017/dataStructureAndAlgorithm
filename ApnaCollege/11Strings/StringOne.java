import java.util.*;
public class StringOne {
  public static void main(String[] args) {
    char arr[] = { 'a', 'b', 'c', 'd', 'e' };
    String str = "abcd";
    String str2 = new String("Faraz alam");
    System.out.println(str + ", " + str2 + "," + ", " + arr);
    //input and output
    Scanner sc = new Scanner(System.in);
    String str3, str4;
    str3 = sc.next();//without space
    str4 = sc.nextLine();//with space
    System.out.println(str3);
    System.out.println(str4);
    String name = "Faraz alam";
    System.out.println(name.length());
    sc.close();
  }
}
