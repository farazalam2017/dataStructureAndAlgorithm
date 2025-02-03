/* Linked Hash Map */
import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHash {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India", 100);
    lhm.put("China", 200);
    lhm.put("Us", 300);
    System.out.println(lhm);
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 200);
    hm.put("USA", 300);
    System.out.println(hm);
  }
}
