
public class BinomialCoeff {
  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }

  public static int BinomialCoeff1(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_ncr = factorial(n - r);
    int BinomialCoeff = fact_n / (fact_r * fact_ncr);
    return BinomialCoeff;
  }
  public static void main(String[] args) {
    System.out.println(BinomialCoeff1(5, 2));
  }
}
