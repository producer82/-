import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        // 자료형
        // float과 long 숫자는 자료형을 구분하기 위해 숫자의 맨 뒤에 F와 L을 붙여준다.
        // boolean 형에는 참 또는 거짓만 저장할 수 있다.
        int intNum = 10;
        long longNum = 1000000000L;
        float floatNum = 3.14F; 
        double doubleNum = 1.0;
        boolean bool = true;

        System.out.println(intNum + " " + longNum + " " + floatNum + " " + doubleNum);
        System.out.println(bool);
        
        // 형변환
        // 데이터 손실이 없는 자료형으로는 묵시적 형변환이 가능하다.
        int num1 = 15;
        double num2 = num1;
        System.out.println(num2);

        // 데이터 손실이 발생하는 자료형으로는 명시적 형변환만 가능하다.
        num2 = 15.7;
        num1 = (int) num2;
        System.out.println(num1);

        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("이름" + name);
        // 스캐너는 모두 쓰면 닫아주어야 한다.
        scanner.close();
    }
}
