package 에버랜드;

import java.util.Scanner;

public class Everland5Input {
	public Scanner myInput = new Scanner(System.in);
	// 기본변수
	public int useDate, order = 0, inputPreferential = 0, price = 0, manAge = 0, addOrder = 0;
	public String preferential = "", bigSmall = "", birthday = "", ticket = "";
	
	public void inputDate() {
		while(true) {
			System.out.print("이용날짜를 입력해주세요(2021년 6월 ~ 11월)\n날짜 : ");
			useDate = myInput.nextInt();
			String useDatePart = String.valueOf(useDate);
			if(useDatePart.length() != 8) {
				 System.out.println("\n이용날짜 8자리를 정확히 입력해주세요");
				continue;
			}
			
		// 이용날짜에 따른 티켓종류 구분
		if(useDate == 20210904 || useDate == 20210905 || useDate == 20210911 || useDate == 20210912 || useDate == 20210918 ||
				useDate == 20210919 || useDate == 20210920 || useDate == 20210921 || useDate == 20210922 || useDate == 20210925 ||
				useDate == 20210926 || useDate == 20211002 || useDate == 20211003 || useDate == 20211009 || useDate == 20211010 ||
				useDate == 20211016 || useDate == 20211017 || useDate == 20211023 || useDate == 20211024 || useDate == 20211030 ||
				useDate == 20211106 || useDate == 20211107) {
			ticket = "A티켓";
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
			ticket = "B티켓";
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
			ticket = "C티켓";
		} else {
			System.out.println("\n이용날짜를 정확히 입력해주세요");
			continue;
		}
		useDate = Integer.parseInt(useDatePart);
		break;
		}
		
	}
	
	public void inputBirthday() {
		while(true) {
			System.out.print("\n생년월일을 입력해주세요(앞의6자리) : "); 
			birthday = myInput.next();
			if(birthday.length() != 6) {
				 System.out.print("\n생년월일 6자리를 정확히 입력해주세요");
				continue;
			}
			int birthMonth = Integer.parseInt(birthday.substring(2,4));
			int birthDate = Integer.parseInt(birthday.substring(4,6));
			if (birthMonth <= 12 && birthDate <= 31) {
				} else {
					 System.out.print("\n생년월일 6자리를 정확히 입력해주세요");
					 continue;
				 }
			break;
		 }
		
	}
	
	public void inputBuyTicket() {
		do{
			System.out.print("티켓구매수량을 입력해주세요\n(사회적거리두기에 따라 최대 4매) : ");
			order = myInput.nextInt();
		 }while(order < 1 || order > 4);
	}
	
	public void inputPreferentail() {
		do{
			System.out.print("우대사항을 선택해주세요\n(1.없음 2.장애인 3.국가유공자 4.다자녀 5.임산부) : ");
			inputPreferential = myInput.nextInt();
		 }while(inputPreferential < 1 || inputPreferential > 5);
	}
	
	public void inputAddPerson() {
		do{
		System.out.printf("인원추가 여부를 확인해주세요.\n(1.인원추가  2.구매완료) : ");
		addOrder = myInput.nextInt();
		 }while(addOrder < 1 || addOrder > 2);
	}
	
}
