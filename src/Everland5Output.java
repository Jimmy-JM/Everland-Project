package ��������;

import java.util.ArrayList;

public class Everland5Output {
	int totalPrice = 0;
	
	///arrData ��̸���Ʈ ���� (DataClass Ŭ�������� �޾ƿ� ������)
	public ArrayList<Everland5DataClass> arrData = new ArrayList<Everland5DataClass>();

	//DataClass Ŭ�������� ������ �޾ƿͼ� arrData ��̸���Ʈ�� �߰�
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
	
	//arrData ������� ���� ������ ���ڸ�ŭ ���ݰ� ������ ���ؼ� �ѱݾ� �հ� ���
	public void totalPriceCount() {
		for(int i = 0; i < arrData.size(); i++) {
			totalPrice = totalPrice + arrData.get(i).price * arrData.get(i).order;
		}
	}
	
	//arrData ������� ���� �����͸� �޾ƿͼ� ����, ����, ����, ��뿩��, Ƽ������, �������� ���
	public void output() {
        System.out.println();
        System.out.println();
		System.out.printf("�� Ƽ�� ������ %d�� �Դϴ�.\n�����մϴ�.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("==================== �������� =====================\n");
		for(int index = 0; index < arrData.size(); index++) {
			System.out.printf("%s %s \t %dx%d�� \t %s / %s\n", arrData.get(index).ticket, arrData.get(index).bigSmall,
					arrData.get(index).price, arrData.get(index).order, arrData.get(index).preferential,
					arrData.get(index).coupon);
		}
		System.out.print("=================================================");
	}

}
