public class Day4 {
    public static void main(String[] args) {
        // 배열
        int[] scores = {10, 20, 30, 40, 50}; // 선언과 동시에 값을 저장할 수있다.
        int[] nums = new int[5]; // 원하는 크기로 만들 수도 있다. 값은 0으로 초기화된다.
        System.out.println("a: " + scores[0] + " b: " + scores[4]);    // 배열은 0에서 시작한다. 
        System.out.println("length: " + scores.length); // .length로 배열의 길이를 가져올 수 있다. 
        // scores[5]; // 배열의 범위를 벗어나면 OutOfBoundsException 오류가 발생한다.
        System.out.println("============================");

        // for문
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // 배열과 궁합이 좋다
        for (i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("============================");

        // while문
        i = 0;
        while (i < 5) { // 조건이 true면 반복한다. 계속 true면 무한 반복한다.
            System.out.println(i);
            i++;
        }
        System.out.println("============================");
        
        // do while문
        i = 10;
        // while 문은 조건에 부합하지 않으면 아예 실행하지 않는다.
        while (i < 5) {
            System.out.println("while"); // 실행되지 않는다.
        }
        // do while 문은 조건에 부합하지 않아도 일단 한 번은 실행한다.
        do {
            System.out.println("do while"); // 실행된다.
        } while (i < 5);
        System.out.println("============================");
        
        // break와 continue
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // i가 5면 반복문을 탈출한다.
            }
            System.out.println(i);
        }
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // i가 3이면 현재 반복을 건너뛰고 다음으로 넘어간다.
            }
            System.out.println(i);
        }
        System.out.println("============================");

        // 1부터 100까지 합 구하기
        int sum = 0;
        for (i = 0; i < 100; i++) {
            sum += i+1;
        }
        System.out.println(sum);
        System.out.println("============================");

        // 배열 순회하기
        int[] numbers = {10, 25, 30, 45, 50, 61, 70};
        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 모든 값 출력하기
        }
        System.out.println("");
        sum = 0;
        int max = numbers[0]; 
        for (i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println("합: " + sum); // 배열의 합 출력하기
        System.out.println("평균: " + ((double)sum / numbers.length)); // 배열의 평균 출력하기, 형변환 해야 소수점까지 나온다.
        System.out.println("최대값: " + (max)); // 배열의 가장 큰 값 출력하기
        System.out.print("짝수:");
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("============================");

        // 간단한 검색
        int[] search = {10, 20, 30, 40, 50};
        for (i = 0; i < search.length; i++) {
            if (search[i] == 30) {
                System.out.println("30을 찾았습니다.");
                break;
            }
        }
        System.out.println("============================");

        // while문 발사
        i = 5;
        while (i >= 0) {
            if (i != 0) {
                System.out.println(i);
            }
            else {
                System.out.println("발사!");
            }
            i--;
        }
    }
}
