class FruitSeller
{
  int numOfApple;
  int myMoney;
  int APPLE_PRICE;

  public int saleApple(int money)
  {
    int num=money/APPLE_PRICE;
    numOfApple-=num;
    myMoney+=money;
    return num;
  }
  public void showSaleResult()
  {
    System.out.println("remind apple : " + numOfApple);
    System.out.println("profit apple : " + myMoney);
  }
  public void initMembers(int money, int appleNum, int price)
  {
    myMoney=money;
    numOfApple=appleNum;
    APPLE_PRICE=price;
  }
}

class FruitBuyer
{
  int myMoney=10000;
  int numOfApple=0;

  public void buyApple(FruitSeller seller, int money)
  {
    numOfApple+=seller.saleApple(money);
    myMoney-=money;
  }
  public void showBuyResult()
  {
    System.out.println("remind money : " +myMoney);
    System.out.println("apple num : " + numOfApple);
  }
}

class FruitSalesMain2_2
{
  public static void main(String[] args)
  {
    FruitSeller seller1=new FruitSeller();
    seller1.initMembers(0,30,1500);

    FruitSeller seller2=new FruitSeller();
    seller2.initMembers(0,20,1000);

    FruitBuyer buyer=new FruitBuyer();
    buyer.buyApple(seller1,4500);
    buyer.buyApple(seller2,2000);

    System.out.println("seller1");
    seller1.showSaleResult();

    System.out.println("seller2");
    seller2.showSaleResult();

    System.out.println("buyer");
    buyer.showBuyResult();
  }
}
