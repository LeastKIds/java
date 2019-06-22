class Rectangle
{
  private int ulx, uly;
  private int lrx, lry;

  private boolean xyCheck(int pox)
  {
    if(pox>=0 && pox<=100)
      return true;
    else
      return false;
  }

  public void Rectangle(int eUlx, int eUly, int eLrx, int eLry)
  {
    if((eLrx-eUlx)>0 || (eLry-eUly)>0)
      return;
    if(!xyCheck(eUlx) || !xyCheck(eUly))
      return;
    if(!xyCheck(eLrx) || !xyCheck(eLry))
      return;

    ulx=eUlx;
    uly=eUly;
    lrx=eLrx;
    lry=eLry;
    return;
  }
  public void showArea()
  {
    int xLen=lrx-ulx;
    int yLen=lry-uly;
    System.out.println("Area : " + (xLen*yLen));
  }
}

class Problem9_1_1_2
{
  public static void main(String[] args)
  {
    Rectangle rec=new Rectangle(2,2,4,4);
    rec.showArea();
  }
}
