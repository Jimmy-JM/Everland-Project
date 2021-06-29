package 에버랜드;

import java.util.Scanner;

public class Everland5 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		Everland5Process everProcess = new Everland5Process();
		Everland5Input everInput = new Everland5Input();
		Everland5Data everData = new Everland5Data();
		
		everInput.inputDate(); // 이용날짜 8자리 입력
		do { // do-while문으로 인원추가시 여기부터 반복
			everInput.inputBirthday(); // 생년월일 6자리 입력	
			everInput.inputBuyTicket(); // 티켓구매수량 입력
			everInput.inputPreferentail(); // 우대사항 선택
			everInput.inputAddPerson(); // 인원추가 여부
			everProcess.manAgeCount(everInput.birthday); // (만)나이 계산
			everProcess.ageClassification(); // 생년월일에 따른 대인/소인/청소년/경로/유아 판단여부
			everProcess.preferticketPrice(everInput.inputPreferential, everInput.ticket); // 우대사항에 따른 기간별&연령별 티켓가격
			everData.variables(everInput.ticket, everProcess.preferential, everProcess.bigSmall, 
					everProcess.price, everInput.order); // 인원추가를 위한 배열 변수 저장
		} while(everInput.addOrder == 1);
		everData.totalPriceCount(); // 티켓 합계금액 계산
		everData.output(); //출력
		myInput.close();
	}
}