class StringCopy_2
{
  public static void main(String[] args)
  {
    String str1="Lemon";
    String str2="Lemon";
    String str3=new String(str2);

    if(str1==str2)
      System.out.println("str1 and str2 are same instance");
    else
      System.out.println("str1 and str2 are not smae instance");

    if(str2==str3)
      System.out.println("str1 and str2 are same instance");
    else
      System.out.println("str1 and str2 are not same instance");
  }
}
