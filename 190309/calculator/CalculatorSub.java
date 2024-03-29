package cal;

public class CalculatorSub
{
  private Adder adder;
  private Subtractor subtractor;

  public CalculatorSub()
  {
    adder = new Adder();
    subtractor = new Subtractor();
  }
  public int addTwoNumber(int num1, int num2)
  {
    return adder.addTwoNumber(num1,num2);
  }
  public int subTwoNumber(int num1, int num2)
  {
    return subtractor.subTwoNumber(num1,num2);
  }
  public void showOperatingTimes()
  {
    System.out.println("add count : " + adder.getCntAdd());
    System.out.println("sub count : " + subtractor.getCntSub());
  }
}

class Adder
{
  private int cntAdd;
  Adder() { cntAdd=0; }
  int getCntAdd() { return cntAdd;  }
  int addTwoNumber(int num1, int num2)
  {
    cntAdd++;
    return num1+num2;
  }
}

class Subtractor
{
  private int cntSub;

  Subtractor()  { cntSub=0; }
  int getCntSub() { return cntSub;  }
  int subTwoNumber(int num1, int num2)
  {
    cntSub++;
    return num1-num2;
  }
}
