package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		//System.out.println("반복횟수를 입력하세요.");
		
		
		int month = 1;
		int year = 2020;
		
		while(true) {
			System.out.println("연도를 입력하세요");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			
			if(month > 12 || month < 1) {
				continue;
			}
			cal.printCalendar(year, month);
		}
		
		System.out.println("Bye~");
		
		//cal.printSampleCalendar();
		
		scanner.close();
	}
	
	
	public static void main(String[] args) {	
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
		
		
	}
}
