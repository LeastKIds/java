class Problem5_4_3_5
{
  public static void main(String[] args)
  {
    int sum=0;

    for(int i=1; i<=100; i++)
    {
      if(i%2==0 && i%7==0)
        sum +=i;
    }

    System.out.println(sum);
  }
}
