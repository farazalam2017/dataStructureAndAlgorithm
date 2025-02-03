public class StringCompare {
  public static void main(String[] args) {
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");
    if(s1.equals(s3)){
    System.out.print("Yes");
    }  else{
    System.out.print("No");
    }
    }
}
