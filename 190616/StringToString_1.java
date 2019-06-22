package stringtostring_1;

class Friend
{
  String myName;
  public Friend(String name)
  {
    myName=name;
  }

  public String toString()
  {
    return "my name is " + myName;
  }
}

class StringToString_1
{
  public static void main(String[] args)
  {
    Friend fnd1=new Friend("AAA");
    Friend fnd2=new Friend("BBB");

    System.out.println(fnd1);
    System.out.println(fnd2);

    System.out.print("printing");
    System.out.print("end");
    System.out.println("");
  }
}
