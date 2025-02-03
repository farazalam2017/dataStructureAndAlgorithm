/* For a given set of Strings print largest string lexicographically. i.e ["apple","mango","banana"]
 */
public class Problem {
  public static void main(String[] args) {
    String fruit[] = { "apple", "mango", "banana" };
    String largest = fruit[0];
    for (int i = 1; i < fruit.length; i++) {
      if (largest.compareTo(fruit[i])<0) {
        largest = fruit[i];
      }
    }
    System.out.println(largest);
  }
}