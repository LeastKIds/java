class Test
{
  public static void main(String[] args)
  {
    String str1="a";
    String str2="b";
    String str3=str1+str2;
    String str4=str1.concat(str2);

    if(str3.compareTo(str4)==0)
      System.out.println("str3.compareTo(str4)");
    if(str3==str4)
      System.out.println("str3==str4");
  }
}
