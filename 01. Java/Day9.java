class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    void sound() {
        System.out.println("멍멍!");
    }

    @Override
    void eat() {
        System.out.println("강아지가 밥을 먹습니다.");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println("야옹");
    }

    @Override
    void eat() {
        System.out.println("고양이가 밥을 먹습니다.");
    }
}

public class Day9 {
    public static void main(String[] args) {
        // 다형성 (Polymorphism)
        // 하나의 부모 타입 참조 변수로 여러 가지 자식 타입의 객체를 다룰 수 있는 성질
        Animal animalDog = new Dog("멍멍이"); 
        // animalDog1이라는 변수의 타입은 Animal이지만, 실제로 만들어진 객체는 Dog다.
        Dog dog = new Dog("멍멍이");
        // 참조 타입과 실제 객체를 구분하자
        
        // 왜 부모 타입의 변수로 자식 객체를 다룰 수 있을까?
        // Dog is an Animal 이기 때문이다.
        // 둘 다 실제 객체는 Dog 객체이지만, 이것을 어떤 타입의 관점에서 바라보느냐가 문제다.

        // 그러면 어떤 메서드를 호출 할 수 있을까?
        // 참조 변수의 타입은 "어떤 기능에 접근 가능한가"를 결정한다.
        // eat()은 Animal과 Dog에 둘 다 있기 때문에 아래처럼 접근 가능하다.
        dog.eat(); 
        animalDog.eat();
        // 그런데 sound()의 경우 Animal은 갖고 있지 않다. 따라서 Dog 객체임에도 접근 불가능하다.
        dog.sound(); 
        // animal.sound();
        
        // 오버라이드 된 메서드를 호출하면 어떻게 될까?
        // 참조 변수가 아닌 실제 객체의 기능이 호출된다.
        animalDog.eat();
        // 즉, 메서드를 호출할 수 있는가? -> 참조 타입이 결정
        // 그 메서드의 실제 구현 -> 객체 타입과 오버라이드에 따라 결정
        // 근데 이걸 어디다 써먹는데?

        // 업캐스팅 (Upcasting)
        // 자식 객체의 참조 변수를 부모 타입으로 만드는 것이다.
        // 원래 이렇게 했다면:
        Cat cat = new Cat("나비");
        dog.eat();
        cat.eat();
        // 이제 Animal로 묶을 수 있다.
        Animal animalCat = new Cat("나비");
        animalDog.eat();
        animalCat.eat();
        // 즉, 다른 객체지만 같은 카테고리인 것들을 하나의 타입으로 묶을 수 있다는 것이다.
        // 극단적인 예를 들자면, 동물이 100종 있다고 해보자.
        Animal[] animals = {
            new Dog("초코"),
            new Cat("나비"),
            new Dog("바둑이")
        };
        // 모두 Animal로 묶여있으면 어떤 객체인지 검사할 필요가 없다.
        // 즉, 코드, 배열은 하나인데 객체에 따라 다른 행동이 나온다.
        for (Animal animal : animals) {
            animal.eat();
        }

        // 다운캐스팅 (Downcasting)
        // 부모 타입으로 만들어진 객체를 다시 원래의 자식 타입으로 돌려놓는 것
        Dog downDog = (Dog)animalDog;
        downDog.sound();
        // 주의 할 것: ClassCastException이 발생하는 위험한 경우
        // Cat인데 Dog라고 우겨버리기
        // Dog exceptionDog = (Dog)animalCat2;
        // 컴파일은 되지만 실행할 때 오류가 발생한다. 어떻게 해결할 수 있을까?

        // instanceof
        // 실제 객체 타입을 확인하는 연산자이다.
        // 다운캐스팅 하기 전 이것으로 객체 타입을 확인해주면 좋다.
        if (animalDog instanceof Dog) {
            Dog downDog2 = (Dog)animalDog;
            downDog2.sound();
        }
        for (Animal animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("강아지네요?");
            }
            else if(animal instanceof Cat) {
                System.out.println("고양이네요?");
            }
        }
        
        // 근데 이건 안됨. 자식 참조 변수가 부모 객체를 담는 경우.
        // Dog dog = new Animal("동물");
        // 모든 Animal이 Dog는 아니잖아?
    }
}
