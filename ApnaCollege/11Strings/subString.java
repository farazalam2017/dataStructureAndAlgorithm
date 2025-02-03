public class subString {
  public static String substring(String str, int si, int ei) {
    String substr = "";
    for (int i = si; i < ei; i++) {
      substr += str.charAt(i);
    }
    return substr;
  }
  public static void main(String[] args) {
    String str = new String("Faraz Alam");
    System.out.println(substring(str, 3, 7));
    System.out.println(str.substring(3,7));//using inbuild function
  }
}
