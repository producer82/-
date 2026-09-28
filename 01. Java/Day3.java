import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        // 비교 연산자
        int age = 20;
        System.out.println(age == 20);
        System.out.println(age >= 18);
        System.out.println(age < 30);
        System.out.println("===============");
        
        // 논리 연산자
        age = 25;
        if (age >= 20 && age < 30) {
            System.out.println("20대 입니다.");
        }
        else if (age < 20 || age >= 60) {
            System.out.println("특별 대상입니다.");
        }
        else {
            System.out.println("일반입니다.");
        }

        boolean isAdult = true;
        if (!isAdult) { 
            System.out.println("미성년자입니다.");
        }
        System.out.println("===============");
        
        // String 비교
        String string = "test";

        // 결과는 "같습니다"가 나온다.
        // 올바르지 않은 비교 방법인데 왜 true일까?
        // string과 그냥 문자열 "test" 둘 다 효율적인 메모리 관리를 위해 "스프링 풀"에서 
        // 같은 객체를 가리키고 있기 때문.
        if (string == "test") {
            System.out.println("같습니다.");
        }
        else {
            System.out.println("틀립니다.");
        }

        if (string.equals("test")) {
            System.out.println(".equals로 같습니다.");
        }
        System.out.println("===============");

        // 스위치 케이스
        int menu = 2;

        switch (menu) {
            case 1 -> System.out.println("커피"); // 최근 문법
            case 2 -> System.out.println("라떼");
            default -> System.out.println("잘못된 메뉴입니다.");
        }

        System.out.println("===============");

        // 조건문
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("양수입니다.");
        }
        else if (num == 0) {
            System.out.println("0입니다.");
        }
        else {
            System.out.println("음수입니다.");
        }

        System.out.println("===========================");
        
        System.out.print("성적을 입력하세요:");
        int grade = scanner.nextInt();
        if (grade >= 90) {
            System.out.println("A");
        }
        else if(grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        System.out.println("===============");

        
        System.out.print("ID: ");
        scanner.nextLine(); // 이전에 nextInt를 썼다면 Enter가 문자로 버퍼에 남아있기에 초기화 해줘야함
        String id = scanner.nextLine();
        
        System.out.print("Password: ");
        String pw = scanner.nextLine();

        if (id.equals("admin") && pw.equals("1234")) {
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
        }

        scanner.close();
    }
}
