class Number
{
  int num=0;
  public void addNumb(int n)
  {
    num+=n;
  }
  public int getNumber()
  {
    return num;
  }
}

class PassInstance_4
{
  public static void main(String[] args)
  {
    Number nInst=new Number();
    System.out.println("befor : " + nInst.getNumber());

    simpleMethod(nInst);
    System.out.println("after : " + nInst.getNumber());
  }
  public static void simpleMethod(Number numb)
  {
    numb.addNumb(12);
  }
}
