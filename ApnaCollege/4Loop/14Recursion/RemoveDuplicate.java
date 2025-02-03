public class RemoveDuplicate {
  public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]){
    if (index == str.length()) {
      System.out.println(newStr);
      return;
    }
    char currentChar = Character.toLowerCase(str.charAt(index));
    if (currentChar >= 'a' && currentChar <= 'z') {
      if (map[currentChar - 'a'] == true) {
        removeDuplicate(str, index+1, newStr, map);
      } else {
        map[currentChar - 'a'] = true;
        removeDuplicate(str, index+1, newStr.append(currentChar), map);
      }
    } else {
      removeDuplicate(str, index+1, newStr, map);
    }
    
  }
  public static void main(String[] args) {
    String str = "Coountrry";
    String str1 = "COOUNTTRY";
    String str2 = "COOUnntryy";
    removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);//country
    removeDuplicate(str1, 0, new StringBuilder(""),new boolean[26]);//country
    removeDuplicate(str2, 0, new StringBuilder(""),new boolean[26]);//country
  }
}
/* public class RemoveDuplicate {
  public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {
    if (index == str.length()) {
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(index);
    if (map[currChar - 'a'] == true) {
      removeDuplicate(str, index + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicate(str, index+1, newStr.append(currChar), map);
    }
  }
 public static void main(String[] args) {
   String str = "faaraaz ";
   removeDuplicate(str,0,new StringBuilder(""),new boolean[1000zz]);
 } 
} */
/* 
 * 
 * public class Main {
    public static void removeDuplicate(String str, int index, StringBuilder newstr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }
        char curChar = Character.toLowerCase(str.charAt(index)); // Convert character to lowercase
        if (curChar >= 'a' && curChar <= 'z') {
            if (map[curChar - 'a'] == true) {
                removeDuplicate(str, index + 1, newstr, map);
            } else {
                map[curChar - 'a'] = true;
                removeDuplicate(str, index + 1, newstr.append(curChar), map);
            }
        } else {
            // If the character is not a letter, simply skip it
            removeDuplicate(str, index + 1, newstr, map);
        }
    }

    public static void main(String[] args) {
        String str = "Faaraaza ALamaaa";
        // The size of the map array should be 52 to accommodate both lowercase and uppercase letters
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[52]);
    }
}
 */