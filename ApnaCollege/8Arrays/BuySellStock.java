/* Satatement: - You are given array prices where prices[i] is price of given stock on the ith day.You want to maximize your profit by choosing a singlr day to buy one stock and choosing a different day in future to sell that stock. Return maximum profit you can achieve from this transactions. If you cannot achieve any profit return 0 */
public class BuySellStock {
  public static int buyAndSellStock(int price[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < price.length; i++) {
      if (buyPrice < price[i]) {
        int profit = price[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = price[i];
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(buyAndSellStock(prices));
  }
}
