/* Next greater element */
/* 
 * Next greater element of some element x in an array is the first integer element that is to right of x in same array.
 * example;- arr=[6,8,0,1,3]
 *        :- nextGreater=[8,-1,1,3,-1]
 * O(n)
 */
import java.util.*;
public class NextGreaterElement {
  public static void main(String[] args) {
    int arr[] = { 6, 8, 0, 1, 3 };
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];
    //for(int i=0; i<=arr.length-1;i++, for element x in array that is first element to left of x)
    //arr[]
    for (int i = arr.length-1; i>=0; i--) {
      //while
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {

        s.pop();
      }
      //if-else
      if (s.isEmpty()) {
        nextGreater[i] = -1;
      } else {
        nextGreater[i] = arr[s.peek()];
      }
      //push in stack
      s.push(i);
    }
    for (int i = 0; i < nextGreater.length; i++) {
      System.out.print(nextGreater[i] + " ");
    }
    System.out.println();
  }
}
/* To keep in mind
 * next Greater Right:- above code
 * next Greater left:- for(int i=0;i<=arr.length-1;i++)
 * next Smaller Right:- arr[s.peek()]>=arr[i]
 * next Smaller left:- for(int i=0; i<=arr.length-1;i++)
 *                     arr[s.peek()>=arr[i]]
 * 
 */