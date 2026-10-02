class PuPerson {
    public String name;
}

class PrPerson {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class NewPerson {
    private String name;
    private int age;
    
	NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
	}

    public void introduce() {
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }

    public void haveBirthday() {
        age++;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
        if (age < 0) {
            System.out.println("올바르지 않은 나이입니다.");
            return;
        }
		this.age = age;
	}    
}

class BankAccount {
    private String owner;
    private int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    private boolean isValidAmount(int amount) {
        return amount > 0;
    }

    public void deposit(int amount) {
        if (!isValidAmount(amount)) {
            System.out.println("유효한 값이 아닙니다.");
        }
        else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족입니다.");
            return;
        }
        
        if (!isValidAmount(amount)) {
            System.out.println("올바른 값이 아닙니다.");
            return;
        }

        balance -= amount;
    }

    public void showBalance() {
        System.out.println(owner + "님의 잔액: " + balance);
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}

public class Day7 {
    public static void main(String[] args) {
        // 접근 제어자
        // 클래스의 필드나 메서드에 "누가 접근할 수 있는가?"를 지정하는 것
        // 대표적으로 public, private, protected가 있다.
        // 아무것도 붙이지 않으면 패키지 안에서만 쓸 수 있는 package-private가 된다.

        // public
        // 가장 개방적인 접근 제어자이며, 외부에서 접근 가능하다.
        PuPerson p1 = new PuPerson();
        p1.name = "철수"; // 다른 클래스에서 접근 가능

        // private
        PrPerson p2 = new PrPerson();
        // p2.name = "철수"; // 컴파일 에러, 접근 불가능

        // 왜 이런걸 사용하는가?
        // Day6에서 만든 은행 계좌를 생각해보면...
        // 아무나 접근해서 원하는 값을 넣으면 안된다.
        // private로 만들면 이제 아무나 접근할 수 없다.
        BankAccount account = new BankAccount("철수", 10000);
        // account.balance = -50000; // 컴파일 에러, 접근 불가능
        
        // 그럼 private로 설정한 필드는 어떻게 접근할까?        
        // getter / setter
        // private 필드에 접근하고 싶으면 getter/setter 메서드로 접근한다.
        System.out.println(p2.getName());
        p2.setName("영철");
        System.out.println(p2.getName());
        // 그럼 무작정 setter를 쓰면 좋은가?
        
        // 캡슐화 (Encapsulation)       
        // private로 바꾸고 getter/setter를 쓰는 것 <- X
        // 진짜 의도는 이것들을 사용하여 객체 내부의 상태를 외부에서 함부로 못바꾸게 하는 것
        // 즉, 객체가 자신이 가진 규칙으로 자신의 상태를 관리해야 한다는 것
        account.deposit(-50000); // BankAccount 객체는 자신의 규칙으로 필드를 보호했다.
        account.withdraw(-1000); 
        // account.isValidAmount(); // 외부에서 접근할 필요 없는 메서드도 private로 보호한다.  
        
        // 모든 필드에 setter가 필요한 것은 아니다.
        // 이제 BankAccount 객체는 무자비한 데이터 수정으로부터 보호된다.
        account.deposit(3000);
        account.withdraw(5000);
        System.out.println(account.getBalance());
        System.out.println(account.getOwner());

        // Person 캡슐화 하기
        // 캡슐화된 Person은 왜 이제 더욱 객체지향적으로 변했다고 볼 수 있을까?
        // 객체가 자신의 데이터를 스스로 관리할 수 있기 되었기 때문에.
        NewPerson np = new NewPerson("철수", 20);
        np.haveBirthday();
        np.setAge(-1);
        np.setName("영희");
        np.introduce();
        System.out.println(np.getAge() + np.getName());
    }
}
