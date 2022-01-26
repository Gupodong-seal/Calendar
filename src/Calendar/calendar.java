package Calendar;


import java.util.Scanner;

public class calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		
		System.out.print("일 월 화 수 목 금 토\n");
		System.out.print("--------------------\n");
		System.out.print(" 1  2  3  4  5  6  7\n");
		System.out.print(" 8  9 10 11 12 13 14\n");
		System.out.print("15 16 17 18 19 20 21\n");
		System.out.print("22 23 24 25 26 27 28\n");
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하시오.");
		int month = scanner.nextInt();
		
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, maxDays[month - 1]);
		
		scanner.close();
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	}
}

//System.out.println("달을 입력하시오.");
//Scanner scanner = new Scanner(System.in);
//int month = scanner.nextInt();
//int day;
//int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
//switch(month) {
//case 1:
//	day = a[0];
//	break;
//case 2:
//	day = a[1];
//	break;
//case 3:
//	day = a[2];
//	break;
//case 4:
//	day = a[3];
//	break;
//case 5:
//	day = a[4];
//	break;
//case 6:
//	day = a[5];
//	break;
//case 7:
//	day = a[6];
//	break;
//case 8:
//	day = a[7];
//	break;
//case 9:
//	day = a[8];
//	break;
//case 10:
//	day = a[9];
//	break;
//case 11:
//	day = a[10];
//	break;
//case 12:
//	day = a[11];
//	break;
//	default :
//		System.out.println("존재하지 않는 달입니다.");
//		day = -1;
//}
//
//System.out.printf("%d월은 %d일까지 있습니다.\n",month,day);
//
//
