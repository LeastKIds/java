class Problem6_3_1_2
{
  public static void main(String[] args)
  {
    System.out.println("2^5 : " + square(5));
  }

  public static int square(int n)
  {
    if(n==1)
      return 2;
    else
      return 2*square(n-1);
  }
}
