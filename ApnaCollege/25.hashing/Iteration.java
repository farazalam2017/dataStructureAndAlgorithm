/* Iteration on Hash Map */
import java.util.*;
public class Iteration {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    //Insert- O(1)
    hm.put("India", 100);
    hm.put("China", 500);
    hm.put("USA", 800);
    hm.put("Indonesia", 300);
    hm.put("Nepal", 700);
    //Iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);
    for (String k : keys) {//k=~keys
      System.out.println("keys:- " + k + ", value:- " + hm.get(k));

    }
    //Entry set
    hm.entrySet();
    System.out.println(hm);
  }
}
