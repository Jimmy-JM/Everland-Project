package ��������;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Everland5Process {
	public Scanner myInput = new Scanner(System.in);
	// �⺻����
	public int price = 0, manAge = 0;
	public String preferential = "", bigSmall = "", coupon = "";
	
	// ���� ��¥ �޴� ���� ����
	public SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	public String today = format.format(new Date());
	// ���� ��¥�� �޾Ƽ� ��/��/�Ϻ� �ɰ��鼭 string���� ��ȯ
	public int thisYear = Integer.parseInt(today.substring(0,4));
	public int thisMonth = Integer.parseInt(today.substring(4,6));
	public int thisDay = Integer.parseInt(today.substring(6,8));	
	
	public void manAgeCount(String birthday) {
		int birthYear = Integer.parseInt(birthday.substring(0,2));
		int birthMonth = Integer.parseInt(birthday.substring(2,4));
		int birthDate = Integer.parseInt(birthday.substring(4,6));
		
		if(birthYear > 21) {
		    birthYear = 1900+birthYear;
		    } else if(birthYear <= 21) {
				birthYear = 2000+birthYear;
			} manAge = thisYear-birthYear;
		if(birthMonth > thisMonth) {
			manAge=manAge-1;		
			} else if(birthMonth == thisMonth) {
				if(birthDate>thisDay) {
					manAge=manAge-1;
				}else {
					}
			}else {
				}
	}
	
	public void ageClassification() {
		if(manAge < 3) { bigSmall = "�����̿�";
		} else if (manAge >= 3 && manAge < 13) { bigSmall = "����";
			} else if (manAge >= 13 && manAge < 19) { bigSmall = "û�ҳ�";
				}
			else if (manAge >= 19 && manAge < 65) {	bigSmall = "����";
				}
		else { bigSmall = "���";
		}
	}
	
	public void preferticketPrice(int inputPreferential, String ticket) {
		switch(inputPreferential) {
		case 1: preferential = "������";
			if(ticket == "AƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "����" || bigSmall == "û�ҳ�") {
					price = 60000;
				} else if (bigSmall == "����" || bigSmall == "���" ) {
					price = 48000;
					} 
			else if(ticket == "BƼ��") {
			}	else if (bigSmall == "�����̿�") {
				price = 0;
				} 	else if (bigSmall == "����" || bigSmall == "û�ҳ�") {
						price = 56000;
				}	else if (bigSmall == "����" || bigSmall == "���" ) {
						price = 44000;
					} 
			else if(ticket == "CƼ��") {
			}	else if (bigSmall == "�����̿�") {
				price = 0;
				} 	else if (bigSmall == "����" || bigSmall == "û�ҳ�") {
					price = 50000;
				}	else if (bigSmall == "����" || bigSmall == "���" ) {
					price = 40000;
					} 
		break;
		case 2: preferential = "�����"; 
			if(ticket == "AƼ��") {
			} if (bigSmall == "����") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 28000;
				} else if (bigSmall == "�����̿�") {
					price = 36000;
					} 
			else if(ticket == "BƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 26000;
				} else if (bigSmall == "����") {
					price = 33000;
					} 
			else if(ticket == "CƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 24000;
				} else if (bigSmall == "����") {
					price = 30000;
					} 
		break;
		case 3: preferential = "����������";
			if(ticket == "AƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 24000;
				} else if (bigSmall == "����") {
					price = 30000;
					} 
			else if(ticket == "BƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 22000;
				} else if (bigSmall == "����") {
					price = 28000;
					} 
			else if(ticket == "CƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 20000;
				} else if (bigSmall == "����") {
					price = 25000;
					} 
		break;
		case 4: preferential = "���ڳ�";
			if(ticket == "AƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 38000;
				} else if (bigSmall == "����") {
					price = 48000;
					} 
			else if(ticket == "BƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 35000;
				} else if (bigSmall == "����") {
					price = 44000;
					} 
			else if(ticket == "CƼ��") {
			} if (bigSmall == "�����̿�") {
				price = 0;
				} else if (bigSmall == "û�ҳ�" || bigSmall == "����" || bigSmall == "���") {
					price = 32000;
				} else if (bigSmall == "����") {
					price = 40000;
					} 
		break;
		case 5: preferential = "�ӻ��";
			if(ticket == "AƼ��") {
			} if (bigSmall == "����") {
				price = 51000;
				} else if (bigSmall == "�����̿�") {
					price = 0;
				}
			else if(ticket == "BƼ��") {
				} if (bigSmall == "����") {
					price = 47000;
				} else if (bigSmall == "�����̿�") {
						price = 0;
				}
			else if(ticket == "CƼ��") {
				} if (bigSmall == "����") {
					price = 42000;
				} else if (bigSmall == "�����̿�") {
						price = 0;
				}
		break;
		}
	}

	public void haveEventCoupon(int inputEventCoupon) {
		if(inputEventCoupon == 1) { coupon = "����";
		} else { coupon = "����";
			}
//		System.out.printf("\n%d\n", coupon);
	}
}
