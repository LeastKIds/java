class Problem5_3_2_2
{
  public static void main(String[] args)
  {
    int n=24;

    switch(n/10)
    {
      case 0 :
        System.out.println("0 <= n < 10");
        break;
      case 1 :
        System.out.println("10 <= n < 20");
        break;
      case 2 :
        System.out.println("20 <= n < 30");
        break;
      case 3 :
        System.out.println("30 <= n < 40");
        break;
      default :
        System.out.println("40 <= n");
    }
  }
}
