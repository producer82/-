// 자바는 클래스로 이루어진다
public class Day1 {
    public static void main(String[] args) {
        // 변수 선언 해보기
        String name = "Server Developer";
        int age = 25;
        int money = 10000;

        // 출력 해보기
        System.out.println("직업: " + name);
        System.out.println("나이: " + age);
        System.out.println("재산: " + money);

        System.out.println("========================");

        // print는 개행을 하지 않는다.
        System.out.print("직업: ");
        System.out.println("서버 개발자");
        
        // 연산 해보기
        int a = 10;
        int b = 20;

        // println 안에서 연산 시 괄호를 붙이지 않으면 변수가 따옴표와 먼저 붙어 문자열로 나간다
        System.out.println("10 + 20 = " + (a + b));
        System.out.println("10 - 20 = " + (a - b));
        System.out.println("10 * 20 = " + (a * b));
        System.out.println("10 / 20 = " + (a / b));
        System.out.println("10 % 20 = " + (a % b));
    }
}
