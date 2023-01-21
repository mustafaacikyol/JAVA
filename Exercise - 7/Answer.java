interface ILive {
    void getName();
    void getSpeak();
}

abstract class Animal implements ILive {
    public String name;

    protected Animal(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.print(this.name);
    }

    public String toString() {
        getName();
        getSpeak();
        return "";
    }

}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void getSpeak() {
        System.out.print(" : miyav");
    }

}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void getSpeak() {
        System.out.print(" : havhav");
    }

}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    public void getSpeak() {
        System.out.print(" : hihaghi");
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        Animal animals[] = { new Cat("cat1"), new Cat("cat2"), new Horse("horse1"), new Dog("dog1"), new Dog("dog2"),
                new Horse("horse2"), new Cat("cat3"), new Horse("horse3"), new Horse("horse4"), new Cat("cat4") };
        for (Animal n: animals) {
            System.out.println(n.toString());
        }

    }
}
