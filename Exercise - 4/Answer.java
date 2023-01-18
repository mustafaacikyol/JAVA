import java.util.ArrayList;

class Animal {
    public int age;
    public String gender;

    Animal() {

    }

    Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Boolean isMamal() {
        return true;
    }

    public void mate() {
        System.out.println("Animal mate");
    }

    public void voice() {
        System.out.println("Animal make noise");
    }

    final public void sleep() {
        System.out.println("Animal sleep");
    }

}

class Duck extends Animal {
    String beakColor = "yellow";

    Duck() {

    }

    Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public Boolean isMamal() {
        return false;
    }

    public void mate() {
        System.out.println("Duck mate");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public void quack() {
        System.out.println("vack vack");
    }

    @Override
    public void voice() {
        System.out.println("Duck make noise");
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " " + this.isMamal();
    }

}

class Fish extends Animal {
    private int sizeInFt;
    private Boolean canEat;

    Fish() {

    }

    Fish(int age, String gender, int sizeInFt, Boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public Boolean isMamal() {
        return false;
    }

    public void mate() {
        System.out.println("Fish mate");
    }

    public void swim() {
        System.out.println("Fish swim");
    }

    @Override
    public void voice() {
        System.out.println("Fish make noise");
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " " + this.isMamal();
    }

}

class Zebra extends Animal {
    public Boolean isWild;

    Zebra() {

    }

    Zebra(int age, String gender, Boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    public Boolean isMamal() {
        return true;
    }

    public void mate() {
        System.out.println("zebra mate");
    }

    public void run() {
        System.out.println("Zebra run");
    }

    @Override
    public void voice() {
        System.out.println("Zebra make noise");
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " " + this.isMamal();
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Duck duck = new Duck();
        System.out.println(duck);

        Fish fish = new Fish();
        System.out.println(fish);

        Zebra zebra = new Zebra();
        System.out.println(zebra + "\n");

        ArrayList<Object> list = new ArrayList<Object>();
        Animal animal1 = new Animal(1, "male");
        Animal animal2 = new Animal(2, "female");
        Animal duck1 = new Duck(2, "female", "black");
        Duck duck2 = new Duck(3, "male", "brown");
        Animal duck3 = new Duck(4, "female", "green");
        Animal fish1 = new Fish(3, "male", 5, true);
        Fish fish2 = new Fish(2, "female", 4, false);
        Animal zebra1 = new Zebra(4, "female", true);
        Zebra zebra2 = new Zebra(2, "male", true);
        Animal zebra3 = new Zebra(3, "female", false);
        Zebra zebra4 = new Zebra(2, "male", false);
        list.add(animal1);
        list.add(animal2);
        list.add(duck1);
        list.add(duck2);
        list.add(duck3);
        list.add(fish1);
        list.add(fish2);
        list.add(zebra1);
        list.add(zebra2);
        list.add(zebra3);
        list.add(zebra4);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Duck) {
                Duck d = (Duck) list.get(i);
                if (d.isMamal())
                    System.out.println("Duck is mamal");
                else
                    System.out.println("Duck is not mamal");
                d.mate();
                d.swim();
                d.quack();
                d.voice();
            } else if (list.get(i) instanceof Fish) {
                Fish f = (Fish) list.get(i);
                if (f.isMamal())
                    System.out.println("Fish is mamal");
                else
                    System.out.println("Fish is not mamal");
                f.mate();
                f.swim();
                f.voice();
            } else if (list.get(i) instanceof Zebra) {
                Zebra z = (Zebra) list.get(i);
                if (z.isMamal())
                    System.out.println("Zebra is mamal");
                else
                    System.out.println("Zebra is not mamal");
                z.mate();
                z.run();
                z.voice();
            } else if (list.get(i) instanceof Animal) {
                Animal a = (Animal) list.get(i);
                if (a.isMamal())
                    System.out.println("Animal is mamal");
                else
                    System.out.println("Animal is not mamal");
                a.mate();
                a.voice();
                a.sleep();
            }
        }
    }
}
