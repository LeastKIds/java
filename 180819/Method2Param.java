class Method2Param
{
  public static void main(String[] args)
  {
    double myHeight=175.9;
    hiEveryone(12,12.5);
    hiEveryone(13, myHeight);
    byEveryone();

  }

  public static void hiEveryone(int age, double height)
  {
    System.out.println("my height is " + height);
    System.out.println("my age is " + age);
  }

  public static void byEveryone()
  {
    System.out.println("See you later");
  }
}
