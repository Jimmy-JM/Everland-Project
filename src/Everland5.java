package ��������;

import java.util.Scanner;

public class Everland5 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		Everland5Process everProcess = new Everland5Process();
		Everland5Input everInput = new Everland5Input();
		Everland5Data everData = new Everland5Data();
		
		everInput.inputDate(); // �̿볯¥ 8�ڸ� �Է�
		do { // do-while������ �ο��߰��� ������� �ݺ�
			everInput.inputBirthday(); // ������� 6�ڸ� �Է�	
			everInput.inputBuyTicket(); // Ƽ�ϱ��ż��� �Է�
			everInput.inputPreferentail(); // ������ ����
			everInput.inputAddPerson(); // �ο��߰� ����
			everProcess.manAgeCount(everInput.birthday); // (��)���� ���
			everProcess.ageClassification(); // ������Ͽ� ���� ����/����/û�ҳ�/���/���� �Ǵܿ���
			everProcess.preferticketPrice(everInput.inputPreferential, everInput.ticket); // �����׿� ���� �Ⱓ��&���ɺ� Ƽ�ϰ���
			everData.variables(everInput.ticket, everProcess.preferential, everProcess.bigSmall, 
					everProcess.price, everInput.order); // �ο��߰��� ���� �迭 ���� ����
		} while(everInput.addOrder == 1);
		everData.totalPriceCount(); // Ƽ�� �հ�ݾ� ���
		everData.output(); //���
		myInput.close();
	}
}