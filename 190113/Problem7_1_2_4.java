class Child
{
  int marble;

  public Child(int setMarble)
  {
    marble=setMarble;
  }

  public int getMarble(int n)
  {
    marble+=n;
    return marble;
  }

  public int lossMarble(int n)
  {
    marble-=n;
    return marble;
  }

  public void showMarble()
  {
    System.out.println("Marble : " + marble);
  }
}
class Problem7_1_2_4
{
  public static void main(String[] args)
  {
    Child ch1=new Child(15);
    Child ch2=new Child(9);

    System.out.println("ch1");
    ch1.showMarble();
    System.out.println("ch2");
    ch2.showMarble();

    ch1.getMarble(2);
    ch2.lossMarble(2);

    ch2.getMarble(7);
    ch1.lossMarble(7);

    System.out.println("ch1");
    ch1.showMarble();
    System.out.println("ch2");
    ch2.showMarble();
  }
}
