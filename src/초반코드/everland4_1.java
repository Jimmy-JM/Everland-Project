package ��������;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class everland5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int totalPrice = 0, useDate, order = 0, inputPreferential = 0, price = 0, manAge = 0, orderCount = 0, addOrder = 0;
		String preferential = "", bigSmall = "", birthday = "", ticket = "";
		
		// �ο��߰��� ���� �迭 ���� �Է�
		String[] saveTicket = new String[100];
		String[] savePreferential = new String[100];
		String[] saveBigSmall = new String[100];
		int[] savePrice = new int[100];
		int[] saveOrder = new int[100];
		int[] saveTotalPrice = new int[100];

		
		// ���� ��¥�� �޾Ƽ� ��/��/�Ϻ� �ɰ��鼭 string���� ��ȯ
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(new Date());
		int thisYear = Integer.parseInt(today.substring(0,4));
		int thisMonth = Integer.parseInt(today.substring(4,6));
		int thisDay = Integer.parseInt(today.substring(6,8));

		// �̿볯¥ 8�ڸ� �Է�
		while(true) {
			System.out.print("�̿볯¥�� �Է����ּ���(2021�� 6�� ~ 11��)\n��¥ : ");
			useDate = myInput.nextInt();
			String useDatePart = String.valueOf(useDate);
			if(useDatePart.length() != 8) {
				 System.out.println("\n�̿볯¥ 8�ڸ��� ��Ȯ�� �Է����ּ���");
				continue;
			}
			// �̿볯¥�� ���� Ƽ������ ����
			if(useDate == 20210904 || useDate == 20210905 || useDate == 20210911 || useDate == 20210912 || useDate == 20210918 ||
					useDate == 20210919 || useDate == 20210920 || useDate == 20210921 || useDate == 20210922 || useDate == 20210925 ||
					useDate == 20210926 || useDate == 20211002 || useDate == 20211003 || useDate == 20211009 || useDate == 20211010 ||
					useDate == 20211016 || useDate == 20211017 || useDate == 20211023 || useDate == 20211024 || useDate == 20211030 ||
					useDate == 20211106 || useDate == 20211107) {
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
					useDate ==  20211110 || useDate ==  20211111 || useDate ==  20211112 || useDate ==  20211113 || useDate ==  20211114 ||
					useDate ==  20211120 || useDate ==  20211121 || useDate ==  20211127 || useDate ==  20211128) {
				ticket = "BƼ��";
			}
			else if(useDate == 20210614 || useDate == 20210615 || useDate == 20210616 || useDate == 20210617 || useDate == 20210618 ||
					useDate == 20210621 || useDate == 20210622 || useDate == 20210623 || useDate == 20210624 || useDate == 20210625 || 
					useDate == 20210628 || useDate == 20210629 || useDate == 20210630 || useDate == 20210701 || useDate == 20210702 || 
					useDate == 20210705 || useDate == 20210706 || useDate == 20210707 || useDate == 20210708 || useDate == 20210709 ||
					useDate == 20210711 || useDate == 20210713 || useDate == 20210714 || useDate == 20210715 || useDate == 20210716 ||
					useDate == 20210719 || useDate == 20210720 || useDate == 20210721 || useDate == 20210722 || useDate == 20210723 ||
					useDate == 20210726 || useDate == 20210727 || useDate == 20210728 || useDate == 20210804 || useDate == 20210805 ||
					useDate == 20210806 || useDate == 20210809 || useDate == 20210810 || useDate == 20210811 || useDate == 20210812 ||
					useDate == 20210813 || useDate == 20210816 || useDate == 20210817 || useDate == 20210818 || useDate == 20210819 ||
					useDate == 20210820 || useDate == 20210823 || useDate == 20210824 || useDate == 20210825 || useDate == 20210826 ||
					useDate == 20210827 || useDate == 20210830 || useDate == 20210831 || useDate == 20210901 || useDate == 20210902 ||
					useDate == 20211115 || useDate == 20211116 || useDate == 20211117 || useDate == 20211118 || useDate == 20211119 ||
					useDate == 20211122 || useDate == 20211123 || useDate == 20211124 || useDate == 20211125 || useDate == 20211126 ||
					useDate == 20211129 || useDate == 20211130) {
				ticket = "CƼ��";
			} else {
				System.out.println("\n�̿볯¥�� ��Ȯ�� �Է����ּ���");
				continue;
			}
			useDate = Integer.parseInt(useDatePart);
			break;
		}
		
		// do-while������ �ο��߰��� ������� �ݺ�
		do {
			// ������� 6�ڸ� �Է�
			while(true) {
				System.out.print("\n��������� �Է����ּ���(����6�ڸ�) : "); 
				birthday = myInput.next();
				if(birthday.length() != 6) {
					 System.out.print("\n������� 6�ڸ��� ��Ȯ�� �Է����ּ���");
					continue;
				}
				int birthMonth = Integer.parseInt(birthday.substring(2,4));
				int birthDay = Integer.parseInt(birthday.substring(4,6));
				if (birthMonth <= 12 && birthDay <= 31) {
					} else {
						 System.out.print("\n������� 6�ڸ��� ��Ȯ�� �Է����ּ���");
						 continue;
					 }
				break;
			 }
			
			// ��������� ��,��,�Ϸ� �ɰ�		
			int birthYear = Integer.parseInt(birthday.substring(0,2));
			int birthMonth = Integer.parseInt(birthday.substring(2,4));
			int birthDay = Integer.parseInt(birthday.substring(4,6));

			// Ƽ�ϱ��ż��� �Է�
			do{
				System.out.print("Ƽ�ϱ��ż����� �Է����ּ���\n(��ȸ���Ÿ��α⿡ ���� �ִ� 4��) : ");
				order = myInput.nextInt();
			 }while(order < 1 || order > 4);

			// ������ ����
			do{
				System.out.print("�������� �������ּ���\n(1.���� 2.����� 3.���������� 4.���ڳ� 5.�ӻ��) : ");
				inputPreferential = myInput.nextInt();
			 }while(inputPreferential < 1 || inputPreferential > 5);

			
			// �ο��߰� ����
			do{
			System.out.printf("�ο��߰� ���θ� Ȯ�����ּ���.\n(1.�ο��߰�  2.���ſϷ�) : ");
			addOrder = myInput.nextInt();
			 }while(addOrder < 1 || addOrder > 2);
				
			// (��)���� ���
			if(birthYear > 21) {
			    birthYear = 1900+birthYear;
			    } else if(birthYear <= 21) {
					birthYear = 2000+birthYear;
				} manAge = thisYear-birthYear;
			if(birthMonth > thisMonth) {
				manAge=manAge-1;		
				} else if(birthMonth == thisMonth) {
					if(birthDay>thisDay) {
						manAge=manAge-1;
					}else {
						}
				}else {
					}
			
			// ������Ͽ� ���� ����/����/û�ҳ�/���/���� �Ǵܿ���
			if(manAge < 3) { bigSmall = "�����̿�";
				} else if (manAge >= 3 && manAge < 13) { bigSmall = "����";
					} else if (manAge >= 13 && manAge < 19) { bigSmall = "û�ҳ�";
						}
					else if (manAge >= 19 && manAge < 65) {	bigSmall = "����";
						}
				else { bigSmall = "���";
				}
				
			// �����׿� ���� �Ⱓ��&���ɺ� Ƽ�ϰ���
			switch(inputPreferential) {
			case 1: preferential = "�����׾���";
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

			// �ο��߰��� ���� �迭 ���� ����
			saveTicket[orderCount] = ticket;
			savePreferential[orderCount] = preferential;
			saveBigSmall[orderCount] = bigSmall;
			savePrice[orderCount] = price;
			saveOrder[orderCount] = order;
			saveTotalPrice[orderCount] = totalPrice;
			orderCount++;
			
		} while(addOrder == 1);

		
		for(int i = 0; i < orderCount; i++) {
			totalPrice = totalPrice + savePrice[i] * saveOrder[i];
		}
		
		//���
        System.out.println();
        System.out.println();
		System.out.printf("�� Ƽ�� ������ %d�� �Դϴ�.\n�����մϴ�.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("================ �������� ==================\n");
		for(int index = 0; index < orderCount; index++) {
			System.out.printf("%s %s \t %dx%d�� \t %s\n", saveTicket[index], saveBigSmall[index], savePrice[index], saveOrder[index], savePreferential[index]);	
			totalPrice = savePrice[index] * saveOrder[index];
		}
		System.out.print("==========================================");
		
		myInput.close();
	}
}