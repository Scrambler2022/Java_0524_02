package j0524_shopMall;

public class Washer extends Product {

    // Product 상속을 통해 아래 내용이 선언된 것!
//	String productName;
//	int price;
//	int bonusPoint;
//	int sale;

    int inch = 32;
    String color = "white";

    // 기본 생성자
    Washer(){
        productName = "Grande Washer";
        price = 550;
        bonusPoint = 12;
        sale = 10;
    }
    @Override
    public String toString () {
        return "구매목록 : "+productName;
    }
}
