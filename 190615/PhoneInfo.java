package phonebook.controll;
import phonebook.controll.name.*;
import phonebook.controll.num.*;
import phonebook.controll.birth.*;

public class PhoneInfo
{
  PhoneName pName=new PhoneName();
  PhoneNum pNum=new PhoneNum();
  PhoneBirth pBirth=new PhoneBirth();

  public PhoneInfo(String name, String num, String birth)
  {
    pName.set(name);
    pNum.set(num);
    pBirth.set(birth);
  }
  public PhoneInfo(String name, String num)
  {
    pName.set(name);
    pNum.set(num);
  }

  public void showPhoneInfo()
  {
    System.out.println("name : " + pName.result());
    System.out.println("phone : " + pNum.result());
    if(pBirth.result()!=null)
      System.out.println("birth : " + pBirth.result());
  }
}
