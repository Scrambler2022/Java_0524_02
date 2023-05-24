package shop;


public class Tv extends Product {
	int inch = 70;
	String color = "black";
	//기본 생성자
	Tv() {
		productName = "QLED";
		price = 1500;
		bonusPoint = 15;
		sale = 10;
	}
	@Override
	public String toString () {return "구매목록 : "+ productName}
}
