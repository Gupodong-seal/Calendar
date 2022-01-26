package calendar;
import java.util.Scanner;

//public class Sum {
//	public static void main(String[] args) {
//		System.out.println("두 수를 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//	 	String inputValue = scanner.nextLine();
//	 	String[] splitedValue = inputValue.split(",");
//	 	int first = Integer.parseInt(splitedValue[0]);
//	 	int second = Integer.parseInt(splitedValue[1]);
//	 	int sum = first + second;
//		System.out.println("두 수의 합은"+sum+"입니다." );
//		
//	}
//}
public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
		System.out.println("두 수의 합은 "+sum+"입니다." );
		
	}
}


//입력 : 키보드로 두 수의 입력을 받는다.
//출력 : 화면에 두 수의 합을 출력한다.