/* First non-repeating letter in a stream of character
 * example:- [a,a,b,c,c,x,b]:- [a,-1,b,b,b,b,x]
 */
import java.util.Queue;
public class FirstNonRepeatingCharacterInstreamOfCharacter {
  public static void printNonRepeating(String str) {
    int frequency[] = new int[26];//'a'-'z'
    Queue<Character> q = new java.util.LinkedList<Character>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);
      frequency[ch - 'a']++;
      while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
        q.remove();
      }
      //case 1
      if (q.isEmpty()) {
        System.out.print(-1 + " ");
      } else {
        System.out.print(q.peek() + " ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    String str = "aabccxb";
    printNonRepeating(str);
  }
}
