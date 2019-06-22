import 190119.seller.FruitSeller;
import 190119.buyer.FruitBuyer;

class Problem8_1_1_1
{
  public void main(String[] args)
  {
    FruitSeller seller1=new FruitSeller(0,30,1500);
    FruitSeller seller2=new FruitSeller(0,20,1000);

    FruitBuyer buyer=new FruitBuyer(10000);
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
