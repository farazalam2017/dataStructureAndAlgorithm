
public class Menu {
  public static int menu(String list[], String key) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == key) {
        return 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    String list[] = { "Egg roll", "Dosa", "Pizza", "Burger" };
    String key = "Dosa";
    int test = menu(list, key);
    System.out.print(test);
    
  }
}
