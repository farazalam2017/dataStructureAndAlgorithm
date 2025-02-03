import java.util.TreeMap;
public class TeeMap {
  public static void main(String[] args) {
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("India", 100);
    tm.put("China", 200);
    tm.put("US", 300);
    System.out.println(tm);
  }
}
