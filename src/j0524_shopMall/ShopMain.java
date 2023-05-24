package j0524_shopMall;

public class ShopMain {

	public static void main(String[] args) {
		// 쇼핑몰 프로그램
		
		System.out.println("[삼성 쇼핑몰]");
		System.out.println("1. QLED TV 70인치  2.갤럭시 북  3.홈 미니 블루투스 스피커");
		System.out.println("---------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요");
		//원래 먼저 id,pw 확인 후 맞으면 객체 선언해야함// 객체 선언과 동시에 id와 이름 들어가게 만들기
		Buyer b = new Buyer("hong", "홍길동","길동스");
		//Tv
		//Computer
		//Specker
		//Class Washer 그랑데 세탁기 120,12,10
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Speaker());
		b.buy(new Washer());

		System.out.println("잔액 : " + b.money);
		System.out.println("구매개수 : "+b.list.size());

		//구매목록 메소드 호출
		b.buyList();
	}//main
}//class
