package 에버랜드;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Everland5Process {
	public Scanner myInput = new Scanner(System.in);
	// 기본변수
	public int price = 0, manAge = 0;
	public String preferential = "", bigSmall = "", coupon = "";
	
	// 오늘 날짜 받는 형식 지정
	public SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	public String today = format.format(new Date());
	// 오늘 날짜를 받아서 연/월/일별 쪼개면서 string으로 변환
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
		if(manAge < 3) { bigSmall = "무료이용";
		} else if (manAge >= 3 && manAge < 13) { bigSmall = "소인";
			} else if (manAge >= 13 && manAge < 19) { bigSmall = "청소년";
				}
			else if (manAge >= 19 && manAge < 65) {	bigSmall = "대인";
				}
		else { bigSmall = "경로";
		}
	}
	
	public void preferticketPrice(int inputPreferential, String ticket) {
		switch(inputPreferential) {
		case 1: preferential = "우대없음";
			if(ticket == "A티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "대인" || bigSmall == "청소년") {
					price = 60000;
				} else if (bigSmall == "소인" || bigSmall == "경로" ) {
					price = 48000;
					} 
			else if(ticket == "B티켓") {
			}	else if (bigSmall == "무료이용") {
				price = 0;
				} 	else if (bigSmall == "대인" || bigSmall == "청소년") {
						price = 56000;
				}	else if (bigSmall == "소인" || bigSmall == "경로" ) {
						price = 44000;
					} 
			else if(ticket == "C티켓") {
			}	else if (bigSmall == "무료이용") {
				price = 0;
				} 	else if (bigSmall == "대인" || bigSmall == "청소년") {
					price = 50000;
				}	else if (bigSmall == "소인" || bigSmall == "경로" ) {
					price = 40000;
					} 
		break;
		case 2: preferential = "장애인"; 
			if(ticket == "A티켓") {
			} if (bigSmall == "대인") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 28000;
				} else if (bigSmall == "무료이용") {
					price = 36000;
					} 
			else if(ticket == "B티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 26000;
				} else if (bigSmall == "대인") {
					price = 33000;
					} 
			else if(ticket == "C티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 24000;
				} else if (bigSmall == "대인") {
					price = 30000;
					} 
		break;
		case 3: preferential = "국가유공자";
			if(ticket == "A티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 24000;
				} else if (bigSmall == "대인") {
					price = 30000;
					} 
			else if(ticket == "B티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 22000;
				} else if (bigSmall == "대인") {
					price = 28000;
					} 
			else if(ticket == "C티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 20000;
				} else if (bigSmall == "대인") {
					price = 25000;
					} 
		break;
		case 4: preferential = "다자녀";
			if(ticket == "A티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 38000;
				} else if (bigSmall == "대인") {
					price = 48000;
					} 
			else if(ticket == "B티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 35000;
				} else if (bigSmall == "대인") {
					price = 44000;
					} 
			else if(ticket == "C티켓") {
			} if (bigSmall == "무료이용") {
				price = 0;
				} else if (bigSmall == "청소년" || bigSmall == "소인" || bigSmall == "경로") {
					price = 32000;
				} else if (bigSmall == "대인") {
					price = 40000;
					} 
		break;
		case 5: preferential = "임산부";
			if(ticket == "A티켓") {
			} if (bigSmall == "대인") {
				price = 51000;
				} else if (bigSmall == "무료이용") {
					price = 0;
				}
			else if(ticket == "B티켓") {
				} if (bigSmall == "대인") {
					price = 47000;
				} else if (bigSmall == "무료이용") {
						price = 0;
				}
			else if(ticket == "C티켓") {
				} if (bigSmall == "대인") {
					price = 42000;
				} else if (bigSmall == "무료이용") {
						price = 0;
				}
		break;
		}
	}

	public void haveEventCoupon(int inputEventCoupon) {
		if(inputEventCoupon == 1) { coupon = "있음";
		} else { coupon = "없음";
			}
//		System.out.printf("\n%d\n", coupon);
	}
}
