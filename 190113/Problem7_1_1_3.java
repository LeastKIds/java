class Information
{
  int bottom;
  int height;

  public Information(int mBottom, int mHeight)
  {
    bottom=mBottom;
    height=mHeight;
  }

  public void changeInformation(int mBottom, int mHeight)
  {
    bottom=mBottom;
    height=mHeight;
  }

  public int area()
  {
    return bottom*height/2;
  }
}

class Problem7_1_1_3
{
  public static void main(String[] args)
  {
    Information info=new Information(20,30);
    System.out.println(info.area());

    info.changeInformation(30,40);
    System.out.println(info.area());
  }

}
