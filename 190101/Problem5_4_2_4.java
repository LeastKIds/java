class Problem5_4_2_4
{
  public static void main(String[] args)
  {
    int i=1, boundary=0;

    while(i<=100)
    {
      System.out.println(i);
      if(i<100)
        i++;
      else
        break;
    }

    do
    {
        i--;
        if(i==0)
          break;
        System.out.println(i);


    }while(i>0);
  }
}
