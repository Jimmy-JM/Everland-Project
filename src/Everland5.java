package ��������;

import java.util.Scanner;

public class Everland5 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		Everland5Process everProcess = new Everland5Process();
		Everland5Input everInput = new Everland5Input();
		Everland5Output everOutput = new Everland5Output();
		
		everInput.inputDate(); // �̿볯¥ 8�ڸ� �Է�
		do { // do-while������ �ο��߰��� ������� �ݺ�
			everInput.inputBirthday(); // ������� 6�ڸ� �Է�	
			everInput.inputBuyTicket(); // Ƽ�ϱ��ż��� �Է�
			everInput.inputPreferentail(); // ������ ����
			everInput.inputEventCoupon(); // �������� ����
			everInput.inputAddPerson(); // �ο��߰� ����
			everProcess.manAgeCount(everInput.birthday); // (��)���� ���
			everProcess.ageClassification(); // ������Ͽ� ���� ����/����/û�ҳ�/���/���� �Ǵܿ���
			everProcess.preferticketPrice(everInput.inputPreferential, everInput.ticket); // �����׿� ���� �Ⱓ��&���ɺ� Ƽ�ϰ���
			everProcess.haveEventCoupon(everInput.inputEventCoupon); // �̺�Ʈ ���� ���� ����
			everOutput.variables(everInput.ticket, everProcess.preferential, everProcess.bigSmall, 
					everProcess.price, everInput.order, everProcess.coupon); // �ο��߰��� ���� �迭 ���� ����
		} while(everInput.addOrder == 1);
		everOutput.totalPriceCount(); // Ƽ�� �հ�ݾ� ���
		everOutput.output(); //���
		myInput.close();
	}
}