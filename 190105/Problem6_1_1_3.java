class Problem6_1_1_3
{
  public static void main(String[] args)
  {
    int num1=10, num2=2;
    System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
    System.out.println(num1 + " - " + num2 + " = " + minus(num1,num2));
    System.out.println(num1 + " * " + num2 + " = " + multi(num1,num2));
    System.out.println(num1 + " / " + num2 + " = " + divide(num1,num2));
    System.out.println(num1 + " % " + num2 + " = " + remind(num1,num2));
  }

  public static int add(int num1,int num2)
  {
    return num1+num2;
  }
  public static int minus(int num1, int num2)
  {
    return num1-num2;
  }
  public static int multi(int num1, int num2)
  {
    return num1*num2;
  }
  public static int divide(int num1, int num2)
  {
    return num1/num2;
  }
  public static int remind(int num1, int num2)
  {
    return num1%num2;
  }
}
