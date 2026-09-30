public class Day5 {
    static void hello() { // 반환 값이 없으면 void를 쓴다.
        System.out.println("hello method!");
    }

    static int add(int a, int b) {
        return a+b; // return은 호출 지점으로 값을 반환하고 메서드를 종료시킨다.
        // System.out.println("실행되지 않음");
    }

    // 반환 타입이 달라져도 매개변수만 다르다면 오버로딩이 된다.
    // static 메서드와 일반 메서드도 이렇게 할 수 있다.
    static double add(double a, double b, double c) {
        return a+b+c;
    }

    static int sub(int a, int b) {
        return a-b;
    }

    static int mul(int a, int b) {
        return a*b;
    }

    static int div(int a, int b) {
        return a/b;
    }
    
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    static int max(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    int noStatic(int a, int b) {
        return a-b;
    }

    // main 또한 하나의 메서드이다.
    // JVM이 실행되면 클래스에서 main 함수를 찾아서 자동으로 실행한다.
    // static이 붙는 이유: main이 실행될 시점에는 아직 객체가 있을 수가 없기 때문에...
    public static void main(String[] args) {
        // 메서드 생성과 호출
        // 메서드는 특정 기능을 하나의 이름으로 묶는다.
        // 중복 제거, 가독성, 유지 보수의 간편성 증진을 위해 사용한다.
        // 특히, 서버와 같은 대형 개발을 위해서는 각 기능을 메서드로 묶어서 만들어야 한다...
        hello();
        
        // 매개변수
        int result = add(3,4); // 메서드는 값을 외부에서 여러 개 받아올 수 있다.
        System.out.println(result);
        // return
        // void 메서드
        
        // static과 일반 메서드
        // noStatic(3, 4); // 일반 메서드는 객체 소속이기 때문에 객체가 없으면 실행할 수 없다.
        result = add(10, 20); // static 메서드는 클래스 소속이기에 객체가 없어도 실행할 수 있다.
        System.out.println(result);

        // 메서드 오버로딩
        // 자바에서는 같은 이름의 메서드를 여러 개 만들 수 있다.
        // 단, 매개변수의 개수나 타입, 순서가 달라야 한다.
        // 왜?: 호출되는 시점에서 어느 메서드를 호출해야 할지 구분할 수 있어야 하기 때문이다.
        double result2 = add(1.2, 2.4, 3.2);
        System.out.println(result2);
        System.out.println("=============================");

        System.out.println("사칙연산 메서드");
        System.out.println(add(10,20));
        System.out.println(sub(10,20));
        System.out.println(mul(10,20));
        System.out.println(div(10,20)); // 반환 타입이 int라 0이 나온다.
        System.out.println("=============================");

        System.out.println("홀짝 판별 메서드");
        System.out.println("짝수인가요?: " + isEven(10));
        System.out.println("짝수인가요?: " + isEven(7));
        System.out.println("=============================");

        System.out.println("배열 합계 메서드");
        int[] num1 = {10, 20, 30, 40, 50};
        System.out.println("합: " + sum(num1));
        System.out.println("=============================");

        System.out.println("최댓값 찾기 메서드");
        int[] num2 = {10, 50, 20, 90, 30};
        System.out.println("최댓값: " + max(num2));
        System.out.println("=============================");
        
        System.out.println("메서드 오버로딩");
        System.out.println("add 1번: " + add(3, 4));
        System.out.println("add 2번: " + add(3.2, 1.4, 2.6));
    }
}
