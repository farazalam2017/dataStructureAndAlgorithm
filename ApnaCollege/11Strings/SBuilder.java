public class SBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'a'; ch <= 't'; ch++) {
      sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
  }
}
