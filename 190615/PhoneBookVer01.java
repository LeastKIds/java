package phonebook;
import phonebook.controll.*;

class PhoneBookVer01
{
  public static void main(String[] args)
  {
    PhoneInfo pInfo1=new PhoneInfo("AAA", "323-1111", "92,09,12");
    PhoneInfo pInfo2=new PhoneInfo("BBB", "321-222");

    pInfo1.showPhoneInfo();
    pInfo2.showPhoneInfo();
  }
}
