package scanningmethods_4;
import java.util.Scanner;

class ScanningMethods_4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Name : " );
    String str=keyboard.nextLine();
    System.out.println("Hi " + str);

    System.out.print("True / False \n");
    boolean isTrue=keyboard.nextBoolean();
    if(isTrue==true)
      System.out.println("O");
    else
      System.out.println("X");
    System.out.print("")
  }
}
