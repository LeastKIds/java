class Problem6_3_2_3
{
  public static void main(String[] args)
  {
    binary(30);
  }

  public static int binary(int n)
  {
    if(n>0)
    {
      int remainder=n%2;
      System.out.println(remainder);
      n/=2;
      binary(n);
    }
    return 0;
  }
}
