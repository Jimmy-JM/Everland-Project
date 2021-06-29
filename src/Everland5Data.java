package 에버랜드;

import java.util.ArrayList;

public class Everland5Data {
	// 인원추가를 위한 배열 변수 입력
	public ArrayList<String> arrTicket = new ArrayList<String>();
	public ArrayList<String> arrPreferential = new ArrayList<String>();
	public ArrayList<String> arrBigSmall = new ArrayList<String>();
	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public ArrayList<Integer> arrOrder = new ArrayList<Integer>();
	public ArrayList<Integer> arrTotalPrice = new ArrayList<Integer>();
	int totalPrice = 0;
	
	public void variables(String ticket, String preferential, String bigSmall, int price, int order) {
		arrTicket.add(ticket);
		arrPreferential.add(preferential);
		arrBigSmall.add(bigSmall);
		arrPrice.add(price);
		arrOrder.add(order);
	}
	
	public void totalPriceCount() {
		for(int i = 0; i < arrTicket.size(); i++) {
			totalPrice = totalPrice + arrPrice.get(i) * arrOrder.get(i);
		}
	}
	
	public void output() {
        System.out.println();
        System.out.println();
		System.out.printf("총 티켓 가격은 %d원 입니다.\n감사합니다.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("================ 에버랜드 ==================\n");
		for(int index = 0; index < arrTicket.size(); index++) {
			System.out.printf("%s %s \t %dx%d매 \t %s\n", arrTicket.get(index), arrBigSmall.get(index), arrPrice.get(index), arrOrder.get(index), arrPreferential.get(index));
		}
		System.out.print("==========================================");
	}
	
	
}
