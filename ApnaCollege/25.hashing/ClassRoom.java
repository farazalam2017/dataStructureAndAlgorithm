import java.util.HashMap;
public class ClassRoom {
  public static void main(String[] args) {
    //Create
    HashMap<String, Integer> hm = new HashMap<>();
    //Insert- O(1)
    hm.put("India", 100);
    hm.put("China", 500);
    hm.put("USA", 800);
    System.out.println(hm);
    //Get- O(1)
    int popultation= hm.get("India");
    System.out.println(popultation);
    System.out.println(hm.get("Indonesia"));
    //Contains key- O(1)
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Indonesia"));
    //remove- O(1) 
    System.out.println(hm.remove("China"));
    System.out.println(hm);
    System.out.println(hm.remove("Indonesia"));
    System.out.println(hm);
    //size
    System.out.println(hm.size());
    //clear
    hm.clear();
    //IsEmpty
    System.out.println(hm.isEmpty());
    
    




    
  }
}
