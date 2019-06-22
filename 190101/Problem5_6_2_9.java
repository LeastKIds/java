class Problem5_6_2_9
{
  public static void main(String[] args)
  {
    int n=1 , sum=0;

    while(sum<1000)
    {
      if(n%2!=0 || (n%3==0 && n%2==0))
      {
        if(sum+n>1000)
          System.out.println("1000>sum : " + sum);
        sum +=n;
      }
      n++;
    }
    System.out.println("sum > 1000 : " + sum);
  }
}
