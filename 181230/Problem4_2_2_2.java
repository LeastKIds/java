class Problem4_2_2_2
{
  public static void main(String[] args)
  {
    int endNum=1, num=15678;
    int[] N = {0,0,0,0,0,0,0,0};

    for(int i=7; i>=0; i--)
    {
      if(endNum==0)
      {
        N[i]=0;
        break;
      }
      else
      {
        if(num==1)
        {
          N[i]=1;
          num=0;
        }
        else if(num==0)
        {
          N[i]=0;
          endNum=0;
        }
        else
        {
          num /=2;
          N[i] = num%2;
        }

      }
    }

    for(int i=0; i<8; i++)
      System.out.print(N[i] + " ");

    int right3=3 , right5=5;
    System.out.println("right 3 : " + N[7-right3+1]);
    System.out.println("right 5 : " + N[7-right5+1]);


  }
}
