/* 
* rule:-
* n & ((-1)<<i)
* 
*/
public class ClearLastIthBit {
  public static int clearithbit(int n, int i) {
    int bitMask = (~0) << i;
    return n & bitMask;
  }
 
  public static void main(String[] args) {
    System.out.println(clearithbit(15, 2));
    System.out.println((~1));
  }
}
/* public class Main
{
    public static int lastBitClear(int n, int i){
        int bitMask=((-1)<<i);
        return n & bitMask;
    }
	public static void main(String[] args) {
	System.out.println(lastBitClear(5,3));
	System.out.print((~1));
	}
}
 */