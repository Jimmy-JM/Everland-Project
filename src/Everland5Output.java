package ��������;

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
		System.out.printf("�� Ƽ�� ������ %d�� �Դϴ�.\n�����մϴ�.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("==================== �������� ====================\n");
		for(int index = 0; index < arrData.size(); index++) {
			System.out.printf("%s %s \t %dx%d�� \t %s \t %s\n", arrData.get(index).ticket, arrData.get(index).bigSmall,
					arrData.get(index).price, arrData.get(index).order, arrData.get(index).preferential,
					arrData.get(index).coupon);
		}
		System.out.print("================================================");
	}
	
	
}
