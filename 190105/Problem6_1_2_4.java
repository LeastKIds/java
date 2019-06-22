class Problem6_1_2_4
{
  public static void main(String[] args)
  {
    int num1=20, num2=40;
    System.out.println("[ " + num1 + " - " + num2 + " ] = " +absolute(num1,num2));
  }

  public static int absolute(int num1, int num2)
  {
    if(num1>=num2)
      return num1-num2;
    else
      return num2-num1;
  }
}
