package sub;

class Point
{
  int xPos, yPos, radius;

  public Point(int x, int y, int r)
  {
    xPos=x;
    yPos=y;
    radius=r;
  }

  public void showPointInfo()
  {
    System.out.println("["+xPos+","+yPos+"]");
  }
}
