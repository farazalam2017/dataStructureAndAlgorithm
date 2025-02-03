public class BitwiseUpdate {
  public static int clearithbit(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  public static int updateBit(int n, int i, int newBit) {
    n = clearithbit(n, i);
    int bitMask = newBit << i;
    return n | bitMask;
  }
  public static void main(String[] args) {
    System.out.println(updateBit(10, 2, 1));
  }
}