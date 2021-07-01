package 에버랜드;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int totalPrice = 0, usedate, order = 0, inputPreferential = 0, price = 0, manAge = 0;
		String ticket = "", preferential = "", bigSmall = "", birthday = "";
		
		do{
			System.out.print("이용날짜를 입력해주세요 : ");
			usedate = myInput.nextInt();
		}while(usedate < 20210601 || usedate > 20211130);
		
		System.out.print("생년월일을 입력해주세요(앞의6자리) : ");
		birthday = myInput.next();
		
		do{
			System.out.print("수량을 입력해주세요 : ");
			order = myInput.nextInt();
		 }while(order < 1 || order > 4);
		
		do{
			System.out.print("우대사항을 선택해주세요\n(1.없음 2.장애인 3.국가유공자 4.다자녀 5.임산부) : ");
			inputPreferential = myInput.nextInt();
		 }while(inputPreferential < 1 || inputPreferential > 5);
			
		// 우대사항
		switch(inputPreferential) {
		case 1: preferential = "우대사항없음"; break;
		case 2: preferential = "장애인"; break;
		case 3: preferential = "국가유공자"; break;
		case 4: preferential = "다자녀"; break;
		case 5: preferential = "임산부"; break;
		}			
		
		// 만나이 계산
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(new Date());
		
		int thisYear = Integer.parseInt(today.substring(0,4));
		int thisMonth = Integer.parseInt(today.substring(4,6));
		int thisDay = Integer.parseInt(today.substring(6,8));
				
		int juminYear = Integer.parseInt(birthday.substring(0,2));
		int juminMonth = Integer.parseInt(birthday.substring(2,4));
		int juminDay = Integer.parseInt(birthday.substring(4,6));
//		System.out.println(juminYear);
	
		if(juminYear > 21) {
		    juminYear = 1900+juminYear;}
		else if(juminYear <= 21) {
			juminYear = 2000+juminYear;
		}		
		manAge = thisYear-juminYear;
		
		if(juminMonth > thisMonth) {
			manAge=manAge-1;
//			System.out.println("(만)나이" + manAge);			
		}else if(juminMonth == thisMonth) {
			if(juminDay>thisDay) {
				manAge=manAge-1;
//				System.out.println("(만)나이" + manAge);	
			}else {
//				System.out.println("(만)나이" + manAge);	
			}
		}else {
//			System.out.println("(만)나이" + manAge);	
		}
		
		// 생년월일에 따른 여부
		if(manAge < 3) {
			bigSmall = "무료이용";
			} else if (manAge >= 3 && manAge < 13) {
				bigSmall = "소인/경로";
				}
			else {
				bigSmall = "대인/청소년";
			}
		
		
		// 이용날짜에 따른 티켓종류
		if(usedate == 20210904 || usedate == 20210905 || usedate == 20210911 || usedate == 20210912 || usedate == 20210918 || usedate == 20210919 ||
				usedate == 20210920 || usedate == 20210921 || usedate == 20210922 || usedate == 20210925 || usedate == 20210926 || usedate == 20211002 ||
				usedate == 20211003 || usedate == 20211009 || usedate == 20211010 || usedate == 20211016 || usedate == 20211017 || usedate == 20211023 ||
				usedate == 20211024 || usedate == 20211030 || usedate == 20211106 || usedate == 20211107) {
			ticket = "A티켓";
		}
		else if(usedate == 20210601 || usedate ==  20210602 || usedate ==  20210603 || usedate ==  20210604 || usedate ==  20210605 ||
				usedate ==  20210606 || usedate ==  20210607 || usedate ==  20210608 || usedate ==  20210909 || usedate ==  20210610 ||
				usedate ==  20210611 || usedate ==  20210612 || usedate ==  20210613 || usedate ==  20210619 || usedate ==  20210620 ||
				usedate ==  20210626 || usedate ==  20210627 || usedate ==  20210703 || usedate ==  20210704 || usedate ==  20210710 ||
				usedate ==  20210711 || usedate ==  20210717 || usedate ==  20210718 || usedate ==  20210724 || usedate ==  20210725 ||
				usedate ==  20210729 || usedate ==  20210930 || usedate ==  20210931 || usedate ==  20210801 || usedate ==  20210802 ||
				usedate ==  20210803 || usedate ==  20210807 || usedate ==  20210808 || usedate ==  20210814 || usedate ==  20210815 ||
				usedate ==  20210821 || usedate ==  20210822 || usedate ==  20210828 || usedate ==  20210829 || usedate ==  20210903 ||
				usedate ==  20210906 || usedate ==  20210906 || usedate ==  20210907 || usedate ==  20210908 || usedate ==  20210909 ||
				usedate ==  20210910 || usedate ==  20210913 || usedate ==  20210914 || usedate ==  20210915 || usedate ==  20210916 ||
				usedate ==  20210917 || usedate ==  20210923 || usedate ==  20210924 || usedate ==  20210927 || usedate ==  20210928 ||
				usedate ==  20210929 || usedate ==  20210930 || usedate ==  20211001 || usedate ==  20211004 || usedate ==  20211005 ||
				usedate ==  20211006 || usedate ==  20211007 || usedate ==  20211008 || usedate ==  20211011 || usedate ==  20211012 ||
				usedate ==  20211013 || usedate ==  20211014 || usedate ==  20211015 || usedate ==  20211018 || usedate ==  20211019 ||
				usedate ==  20211020 || usedate ==  20211021 || usedate ==  20211022 || usedate ==  20211025 || usedate ==  20211026 ||
				usedate ==  20211027 || usedate ==  20211028 || usedate ==  20211029 || usedate ==  20211101 || usedate ==  20211102 ||
				usedate ==  20211103 || usedate ==  20211104 || usedate ==  20211105 || usedate ==  20211108 || usedate ==  20211109 ||
				usedate ==  20211110 || usedate ==  20211112 || usedate ==  20211113 || usedate ==  20211114 || usedate ==  20211120 ||
				usedate ==  20211121 || usedate ==  20211127 || usedate ==  20211128) {
			ticket = "B티켓";
		}
		else {
			ticket = "C티켓";
		}
		
		// 만나이로 구분한 대인/청소년, 소인/경로에 따른 티켓 가격
		if(ticket == "A티켓") {
			if(bigSmall == "무료이용") {
				price = 0;
			} else if (bigSmall == "소인/경로") {
				price = 48000;
			} else if (bigSmall == "대인/청소년") {
				price = 60000;
			}
		}
		else if(ticket == "B티켓") {
				if(bigSmall == "무료이용") {
					price = 0;
				} else if (bigSmall == "소인/경로") {
					price = 44000;
				} else if (bigSmall == "대인/청소년") {
					price = 56000;
				}
		}
		else if(ticket == "C티켓") {
			if(bigSmall == "무료이용") {
				price = 0;
			} else if (bigSmall == "소인/경로") {
				price = 40000;
			} else if (bigSmall == "대인/청소년") {
				price = 50000;
			}
		}

		myInput.close();

		//총금액
		totalPrice = order * price;
		
		//출력
        System.out.println();
		System.out.printf("총 티켓 가격은 %d원 입니다.\n감사합니다.", totalPrice);
        System.out.println();
        System.out.println();
		System.out.print("================= 에버랜드 ==================\n");
		System.out.printf("%s %s  %dx%d매  %d  %s\n", ticket, bigSmall, price, order, totalPrice, preferential);
		System.out.print("===========================================");
		
	}
}
