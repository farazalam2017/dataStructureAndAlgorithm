/* Iteration on Hash Set */
import java.util.HashSet;
import java.util.Iterator;
public class iteraionOnHS {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("A");
    cities.add("B");
    cities.add("C");
    cities.add("D");
    cities.add("E");
    //Uisng Iterator
    // Iterator it = cities.iterator();//return valid iterator
    // while (it.hasNext()) {
    //   System.out.println(it.next());

    // }
    //Using Advance for loop
    for (String city : cities) {
  System.out.println(city);
}
  }
}
