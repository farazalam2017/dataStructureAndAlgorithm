/* Problem:- Find and print all the subset of given string */
/* "abc"-> a,b,c,ab,bc,ac,abc," ".(8) */
/* for n number of elements number of subset is 2^n */
public class Subset {
  public static void subSet(String str, String ans, int i) {
    //base case
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      }else{
      System.out.println(ans);
      }
      return; 
    }
    //Yes choice
    subSet(str, ans+str.charAt(i), i+1);
    //no choice
    subSet(str, ans, i+1);
  }
  public static void main(String[] args) {
    String str = "abc";
    subSet(str, " ", 0);
  }
}
