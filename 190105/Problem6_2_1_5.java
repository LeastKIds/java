class Problem6_2_1_5
{
  public static void main(String[] args)
  {
    int N=5;
    System.out.println("Area : " + area(N));
    System.out.println("Circumference : " + cir(N));
  }

  public static double area(int N)
  {
    return N*N*3.14;
  }
  public static double cir(int N)
  {
    return N*2*3.14;
  }
}
