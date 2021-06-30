package 에버랜드;

import java.util.ArrayList;

public class Everland5Output {
	int totalPrice = 0;
	
	///arrData 어레이리스트 생성 (DataClass 클래스에서 받아온 데이터)
	public ArrayList<Everland5DataClass> arrData = new ArrayList<Everland5DataClass>();

	//DataClass 클래스에서 데이터 받아와서 arrData 어레이리스트에 추가
	public void variables(String ticket, String preferential, String bigSmall, int price, int order, String coupon) {
			Everland5DataClass item = new Everland5DataClass();
			item.ticket = ticket;
			item.preferential = preferential;
			item.bigSmall = bigSmall;
			item.price = price;
			item.order = order;
			item.coupon = coupon;
			arrData.add(item);
	}
	
	//arrData 사이즈로 쌓인 데이터 숫자만큼 가격과 수량을 곱해서 총금액 합계 계산
	public void totalPriceCount() {
		for(int i = 0; i < arrData.size(); i++) {
			totalPrice = totalPrice + arrData.get(i).price * arrData.get(i).order;
		}
	}
	
	//arrData 사이즈로 쌓인 데이터를 받아와서 가격, 수량, 가격, 우대여부, 티켓종류, 쿠폰여부 출력
	public void output() {
        System.out.println();
        System.out.println();
		System.out.printf("총 티켓 가격은 %d원 입니다.\n감사합니다.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("==================== 에버랜드 =====================\n");
		for(int index = 0; index < arrData.size(); index++) {
			System.out.printf("%s %s \t %dx%d매 \t %s / %s\n", arrData.get(index).ticket, arrData.get(index).bigSmall,
					arrData.get(index).price, arrData.get(index).order, arrData.get(index).preferential,
					arrData.get(index).coupon);
		}
		System.out.print("=================================================");
	}

}
