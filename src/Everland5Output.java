package 에버랜드;

import java.util.ArrayList;

public class Everland5Output {
	int totalPrice = 0;
	public ArrayList<Everland5Array> arrData = new ArrayList<Everland5Array>();

	
	public void variables(String ticket, String preferential, String bigSmall, int price, int order, String coupon) {
		arrData.add(new Everland5Array(ticket, preferential, bigSmall, price, order, coupon));
	}
	
	public void totalPriceCount() {
		for(int i = 0; i < arrData.size(); i++) {
			totalPrice = totalPrice + arrData.get(i).price * arrData.get(i).order;
		}
	}
	
	public void output() {
        System.out.println();
        System.out.println();
		System.out.printf("총 티켓 가격은 %d원 입니다.\n감사합니다.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("==================== 에버랜드 ====================\n");
		for(int index = 0; index < arrData.size(); index++) {
			System.out.printf("%s %s \t %dx%d매 \t %s \t %s\n", arrData.get(index).ticket, arrData.get(index).bigSmall,
					arrData.get(index).price, arrData.get(index).order, arrData.get(index).preferential,
					arrData.get(index).coupon);
		}
		System.out.print("================================================");
	}
	
	
}
