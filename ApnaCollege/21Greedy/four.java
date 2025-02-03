/* Maximum length chain of pairs */
import java.util.*;
public class four {
  public static void main(String[] args) {
    int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
    Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
    int chainLength = 1;
    int chainEnd = pairs[0][1];
    
  }
}
