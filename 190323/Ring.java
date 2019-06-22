package sub;

class Ring
{
  int xPos1, yPos1, radius1;
  int xPos2, yPos2, radius2;

  Point point_1=new Point(xPos1,yPos1,radius1);
  Point point_2=new Point(xPos2,yPos2,radius2);

  public Ring(int x1, int y1, int r1, int x2, int y2, int r2)
  {
    xPos1=x1; yPos1=y1;  radius1=r1;
    xPos2=x2; yPos2=y2;  radius2=r2;

  }



  public void showRingInfo()
  {
    System.out.println("Inner Circle Info...");
    System.out.println("radius : " + point_1.radius);
    point_1.showPointInfo();

    System.out.println("Outter Circle Info...");
    System.out.println("radius : " + point_2.radius);
    point_2.showPointInfo();

  }

}
