class Problem6_2_2_6
{
  public static void main(String[] args)
  {
    for(int i=1; i<=100; i++)
      if(prime(i))
        System.out.println("Prime Number : " + i);
  }

  public static boolean prime(int N)
  {
    for(int i=2; i<N; i++)
    {
      if(N%i==0)
        return false;
    }
    return true;
  }
}
