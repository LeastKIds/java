class Problem4_2_1_1
{
  public static void main(String[] args)
  {
    int endNum=1, num=7;
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
    {
      if(N[i]==1)
        N[i]=0;
      else
        N[i]=1;
    }

    if(N[7]==0)
      N[7]=1;
    else
    {
      for(int i=6; i>=0; i--)
      {
        if(N[i]==1)
          N[i]=0;
        else
          N[i]=1;
      }
    }




    for(int i=0; i<8; i++)
      System.out.print(N[i] + " ");
  }
}
