class conPerson {
    String name;
    int age;

    conPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    conPerson() {
        name = "무명";
        age = 0;
    }
    
    void introduce() {
        System.out.println("나는 " + name + "입니다.");
    }
    
    // this의 흔하게 쓰이는 패턴이다.
    void setName(String name) {
        this.name = name;
    }
}

class Person {
    String name;
    int age;
    static int count;

    void introduce() {
        System.out.println("나는 " + name + "이고 나이는 " + age + "살입니다.");
    }
    
    void haveBirthday() {
        age++;
    }

    // this의 흔하게 쓰이는 패턴이다.
    void setName(String name) {
        this.name = name;
    }
}

class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족입니다.");
        }
        else {
            balance -= amount;
        }
    }

    void showBalance() {
        System.out.println(owner + "님의 잔액: " + balance);
    }
}

public class Day6 {
        public static void main(String[] args) {
        // 클래스와 객체
        // 클래스 = 설계도(마우스의 설계도), 
        // 객체 = 설계도로 만들어진 실제 물건(마우스), 
        // 인스턴스 = 객체의 실체화(내가 만든 마우스)

        // new
        // new는 힙에 해당 클래스 크기만큼 빈 객체 공간을 할당한다.
        // 즉, 객체를 생성하는 역할을 한다.
        Person p1 = new Person(); // p1은 객체 자체가 아니라, 그것을 가리키는 참조 변수다.
        Person p2 = new Person();

        // 인스턴스 필드
        // 객체에는 데이터를 저장할 수 있고, 객체마다 데이터를 따로 가진다.
        p1.name = "철수";
        p1.age = 20;

        p2.name = "영희";
        p2.age = 30;

        System.out.println(p1.name);
        System.out.println(p2.name);

        // 인스턴스 메서드
        // 객체에는 데이터를 처리할 메서드를 만들 수 있다.
        p1.introduce();
        p2.introduce();
        
        // this
        // this는 "메서드를 호출한 객체 자신"을 의미한다.
        p1.setName("두한");
        System.out.println(p1.name);
        
        // 생성자
        // 생성자는 객체가 생성될 때만 1회 실행된다.
        // 메서드와 비슷한 기능을 하지만, 반환형이 없고 이름은 반드시 클래스 이름과 동일해야 한다.
        // 주로 객체를 만들자마자 값을 넣고 싶을 때 (인스턴스 필드의 초기화를 위해) 사용된다.
        // 생성자를 하나도 만들지 않았을 때는 자바가 기본 생성자를 자동으로 제공한다.

        // 최종적으로 객체가 만들어지는 과정은:
        // 객체 생성 -> 객체 초기화 -> 생성자 실행 -> p1에 객체 주소 저장의 과정을 거친다.
        conPerson p3 = new conPerson("철수", 40);
        
        // 생성자 오버로딩
        // 생성자도 오버로딩 할 수 있다.
        conPerson p4 = new conPerson(); // 오버로딩으로 아무 값도 들어오지 않으면 기본 값을 할당한다.
        System.out.println(p3.name);
        System.out.println(p4.name);

        // static vs 인스턴스
        // static 필드는 클래스에 속해 클래스 수준에서 하나의 값을 공유한다.
        // 인스턴스는 객체별로 독립적으로 존재한다.
        // new로 생성하지 않아도 프로그램이 시작될 때 메모리가 생성되고, 객체 생성 없이 접근할 수 있다.
        Person.count = 2; // 객체가 아닌 클래스로 접근한다.
        System.out.println(Person.count);

        // Person 클래스 만들기
        p1.introduce();
        p1.haveBirthday();
        p1.introduce();

        // BankAccount 클래스 만들기
        BankAccount account1 = new BankAccount("철수", 10000);

        account1.deposit(5000);
        account1.withdraw(3000);
        account1.showBalance();
        account1.withdraw(13000);

        // 왜 서로 다른 결과가 나올까?
        // 다른 객체니까 각각 다른 인스턴스 필드를 가지고 있다
        p1.age = 50;
        System.out.println(p1.age);
        System.out.println(p2.age);
    }
}
