package ��������;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class everland2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int totalPrice = 0, useDate, order = 0, inputPreferential = 0, price = 0, manAge = 0;
		String ticket = "", preferential = "", bigSmall = "", birthday = "";
		
		// ���� ��¥�� �޾Ƽ� ��/��/�Ϻ��� string ó��
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(new Date());
		int thisYear = Integer.parseInt(today.substring(0,4));
		int thisMonth = Integer.parseInt(today.substring(4,6));
		int thisDay = Integer.parseInt(today.substring(6,8));
		
		while(true) {
			System.out.print("�̿볯¥�� �Է����ּ���(2021�� 6�� ~ 11��)\n��¥ : ");
			useDate = myInput.nextInt();
			String useDatePart = String.valueOf(useDate);
//			int useYear = Integer.parseInt(useDatePart.substring(0,4));
			int useMonth = Integer.parseInt(useDatePart.substring(4,6));
			int useDay = Integer.parseInt(useDatePart.substring(6,8));
				if (useMonth > 11 || useMonth < 6 || useDay <= 0 || useDay > 31) {
					System.out.print("������ �̿볯¥�� �ٽ� �Է����ּ���\n\n");
					continue;
				}
					break;
				}

		System.out.print("��������� �Է����ּ���(����6�ڸ�) : ");
		birthday = myInput.next();
		int juminYear = Integer.parseInt(birthday.substring(0,2));
		int juminMonth = Integer.parseInt(birthday.substring(2,4));
		int juminDay = Integer.parseInt(birthday.substring(4,6));	
//		System.out.println(juminYear);
		
		do{
			System.out.print("������ �Է����ּ��� : ");
			order = myInput.nextInt();
		 }while(order < 1 || order > 4);
		
		do{
			System.out.print("�������� �������ּ���\n(1.���� 2.����� 3.���������� 4.���ڳ� 5.�ӻ��) : ");
			inputPreferential = myInput.nextInt();
		 }while(inputPreferential < 1 || inputPreferential > 5);
			
		// ������
		switch(inputPreferential) {
		case 1: preferential = "�����׾���"; break;
		case 2: preferential = "�����"; break;
		case 3: preferential = "����������"; break;
		case 4: preferential = "���ڳ�"; break;
		case 5: preferential = "�ӻ��"; break;
		}			
		
		// (��)���� ���
		if(juminYear > 21) {
		    juminYear = 1900+juminYear;}
		else if(juminYear <= 21) {
			juminYear = 2000+juminYear;
		}		
		manAge = thisYear-juminYear;
		
		if(juminMonth > thisMonth) {
			manAge=manAge-1;
//			System.out.println("(��)����" + manAge);			
		}else if(juminMonth == thisMonth) {
			if(juminDay>thisDay) {
				manAge=manAge-1;
//				System.out.println("(��)����" + manAge);	
			}else {
//				System.out.println("(��)����" + manAge);	
			}
		}else {
//			System.out.println("(��)����" + manAge);	
		}
		
		// ������Ͽ� ���� ����
		if(manAge < 3) {
			bigSmall = "�����̿�";
			} else if (manAge >= 3 && manAge < 13) {
				bigSmall = "����/���";
				}
			else {
				bigSmall = "����/û�ҳ�";
			}
		
		
		// �̿볯¥�� ���� Ƽ������
		if(useDate == 20210904 || useDate == 20210905 || useDate == 20210911 || useDate == 20210912 || useDate == 20210918 || useDate == 20210919 ||
				useDate == 20210920 || useDate == 20210921 || useDate == 20210922 || useDate == 20210925 || useDate == 20210926 || useDate == 20211002 ||
				useDate == 20211003 || useDate == 20211009 || useDate == 20211010 || useDate == 20211016 || useDate == 20211017 || useDate == 20211023 ||
				useDate == 20211024 || useDate == 20211030 || useDate == 20211106 || useDate == 20211107) {
			ticket = "AƼ��";
		}
		else if(useDate == 20210601 || useDate ==  20210602 || useDate ==  20210603 || useDate ==  20210604 || useDate ==  20210605 ||
				useDate ==  20210606 || useDate ==  20210607 || useDate ==  20210608 || useDate ==  20210909 || useDate ==  20210610 ||
				useDate ==  20210611 || useDate ==  20210612 || useDate ==  20210613 || useDate ==  20210619 || useDate ==  20210620 ||
				useDate ==  20210626 || useDate ==  20210627 || useDate ==  20210703 || useDate ==  20210704 || useDate ==  20210710 ||
				useDate ==  20210711 || useDate ==  20210717 || useDate ==  20210718 || useDate ==  20210724 || useDate ==  20210725 ||
				useDate ==  20210729 || useDate ==  20210930 || useDate ==  20210931 || useDate ==  20210801 || useDate ==  20210802 ||
				useDate ==  20210803 || useDate ==  20210807 || useDate ==  20210808 || useDate ==  20210814 || useDate ==  20210815 ||
				useDate ==  20210821 || useDate ==  20210822 || useDate ==  20210828 || useDate ==  20210829 || useDate ==  20210903 ||
				useDate ==  20210906 || useDate ==  20210906 || useDate ==  20210907 || useDate ==  20210908 || useDate ==  20210909 ||
				useDate ==  20210910 || useDate ==  20210913 || useDate ==  20210914 || useDate ==  20210915 || useDate ==  20210916 ||
				useDate ==  20210917 || useDate ==  20210923 || useDate ==  20210924 || useDate ==  20210927 || useDate ==  20210928 ||
				useDate ==  20210929 || useDate ==  20210930 || useDate ==  20211001 || useDate ==  20211004 || useDate ==  20211005 ||
				useDate ==  20211006 || useDate ==  20211007 || useDate ==  20211008 || useDate ==  20211011 || useDate ==  20211012 ||
				useDate ==  20211013 || useDate ==  20211014 || useDate ==  20211015 || useDate ==  20211018 || useDate ==  20211019 ||
				useDate ==  20211020 || useDate ==  20211021 || useDate ==  20211022 || useDate ==  20211025 || useDate ==  20211026 ||
				useDate ==  20211027 || useDate ==  20211028 || useDate ==  20211029 || useDate ==  20211101 || useDate ==  20211102 ||
				useDate ==  20211103 || useDate ==  20211104 || useDate ==  20211105 || useDate ==  20211108 || useDate ==  20211109 ||
				useDate ==  20211110 || useDate ==  20211112 || useDate ==  20211113 || useDate ==  20211114 || useDate ==  20211120 ||
				useDate ==  20211121 || useDate ==  20211127 || useDate ==  20211128) {
			ticket = "BƼ��";
		}
		else {
			ticket = "CƼ��";
		}
		
		// �����̷� ������ ����/û�ҳ�, ����/��ο� ���� Ƽ�� ����
		if(ticket == "AƼ��") {
			if(bigSmall == "�����̿�") {
				price = 0;
			} else if (bigSmall == "����/���") {
				price = 48000;
			} else if (bigSmall == "����/û�ҳ�") {
				price = 60000;
			}
		}
		else if(ticket == "BƼ��") {
				if(bigSmall == "�����̿�") {
					price = 0;
				} else if (bigSmall == "����/���") {
					price = 44000;
				} else if (bigSmall == "����/û�ҳ�") {
					price = 56000;
				}
		}
		else if(ticket == "CƼ��") {
			if(bigSmall == "�����̿�") {
				price = 0;
			} else if (bigSmall == "����/���") {
				price = 40000;
			} else if (bigSmall == "����/û�ҳ�") {
				price = 50000;
			}
		}

		myInput.close();

		//�ѱݾ�
		totalPrice = order * price;
		
		//���
        System.out.println();
		System.out.printf("�� Ƽ�� ������ %d�� �Դϴ�.\n�����մϴ�.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("================= �������� ==================\n");
		System.out.printf("%s %s  %dx%d��  %d  %s\n", ticket, bigSmall, price, order, totalPrice, preferential);
		System.out.print("===========================================");
		
	}
}
