class FruitSeller
{
  int numOfApple=20;
  int myMoney=0;
  final int APPLE_PRICE=1000;

  public int saleApple(int money)
  {
    int num=money/APPLE_PRICE;
    numOfApple-=num;
    myMoney+=money;
    return num;
  }
  public void showSaleResult()
  {
    System.out.println("apple remind : " + numOfApple);
    System.out.println("apple profit : " + myMoney);
  }
}

class FruitBuyer
{
  int myMoney=5000;
  int numOfApple=0;

  public void buyApple(FruitSeller seller, int money)
  {
    numOfApple+=seller.saleApple(money);
    myMoney-=money;
  }
  public void showBuyResult()
  {
    System.out.println("remind money : " + myMoney);
    System.out.println("apple num : " + numOfApple);
  }
}

class FruitSalesMain1_1
{
  public static void main(String[] args)
  {
    FruitSeller seller = new FruitSeller();
    FruitBuyer buyer = new FruitBuyer();
    buyer.buyApple(seller, 2000);

    System.out.println("show Sale Result");
    seller.showSaleResult();

    System.out.println("show Buy Result");
    buyer.showBuyResult();
  }
}
