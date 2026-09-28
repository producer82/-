import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        // 1. 자료형
        // float과 long 숫자는 자료형을 구분하기 위해 숫자의 맨 뒤에 F와 L을 붙여준다.
        // boolean 형에는 참 또는 거짓만 저장할 수 있다.
        int intNum = 10;
        long longNum = 1000000000L;
        float floatNum = 3.14F; 
        double doubleNum = 1.0;
        boolean bool = true;

        System.out.println(intNum + " " + longNum + " " + floatNum + " " + doubleNum);
        System.out.println(bool);
        
        // 2. 형변환
        // 표현 범위가 더 넓은 자료형으로는 묵시적 형변환이 가능하다.
        int num1 = 15;
        double num2 = num1;
        System.out.println(num2);

        // 표현 범위가 더 좁은 자료형으로는 명시적 형변환만 가능하다.
        num2 = 15.7;
        num1 = (int) num2;
        System.out.println(num1);

        // 3. 입력
        // 자바에서는 스캐너 객체로 입력을 처리한다.
        Scanner scanner = new Scanner(System.in);

        // String 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        // int 입력 받기
        System.out.print("키를 입력하세요: ");
        double height = scanner.nextDouble();
        // double 입력 받기
        System.out.print("나이를 입력하세요: ");
        int old = scanner.nextInt();
        
        System.out.println("=========================");
        System.out.println("이름: " + name);
        System.out.println("키: " + height);
        System.out.println("나이: " + old);

        // 4. 객체 자료형
        // String은 객체이기 때문에 일반 자료형과 달리 여러가지 메소드를 가지고 있다.
        System.out.println("=========================");
        System.out.println("글자 수: " + name.length());
        System.out.println("대문자로: " + name.toUpperCase());
        System.out.println("소문자로: " + name.toLowerCase());
        
        System.out.println("=========================");
        System.out.print("첫 번째 숫자: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = scanner.nextInt();
        System.out.println("더하기: " + (a+b));
        System.out.println("빼기: " + (a-b));
        System.out.println("곱하기: " + (a*b));
        System.out.println("나누기: " + (a/b));
        System.out.println("나머지: " + (a%b));

        // 스캐너는 모두 쓰면 닫아주어야 한다.
        scanner.close();
    }
}
