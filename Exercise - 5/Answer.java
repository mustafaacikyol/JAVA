import java.util.Scanner;

interface IFruit {

    public void fruitName();

    public void quantity(double k);

    public double price();

}

class Strawberry implements IFruit {

    double kilogramPrice;
    double quantity;

    public void fruitName() {
        System.out.print("Strawberry");
    }

    public void quantity(double k) {
        quantity = k;
    }

    public double price() {
        return kilogramPrice * quantity;
    }

}

class Pear implements IFruit {
    double kilogramPrice;
    double quantity;

    public void fruitName() {
        System.out.print("Pear");
    }

    public void quantity(double k) {
        quantity = k;
    }

    public double price() {
        return kilogramPrice * quantity;
    }
}

class Apple implements IFruit {
    double kilogramPrice;
    double quantity;

    public void fruitName() {
        System.out.print("Apple");
    }

    public void quantity(double k) {
        quantity = k;
    }

    public double price() {
        return kilogramPrice * quantity;
    }
}

class Watermelon implements IFruit {
    double kilogramPrice;
    double quantity;

    public void fruitName() {
        System.out.print("Watermelon");
    }

    public void quantity(double k) {
        quantity = k;
    }

    public double price() {
        return kilogramPrice * quantity;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        double totalPrice = 0.0;
        Strawberry strawberry = new Strawberry();
        Pear pear = new Pear();
        Apple apple = new Apple();
        Watermelon watermelon = new Watermelon();

        while (true) {
            System.out.println("0 : Exit");
            System.out.println("1 : Strawberry");
            System.out.println("2 : Pear");
            System.out.println("3 : Apple");
            System.out.println("4 : Watermelon");
            System.out.print("Select the fruit you want to buy : ");
            
            Scanner keyboard = new Scanner(System.in);
            int choice = keyboard.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter quantity: ");
                    strawberry.quantity(keyboard.nextDouble());
                    System.out.print("Enter price: ");
                    strawberry.kilogramPrice = keyboard.nextDouble();
                    strawberry.fruitName();
                    System.out.println(" price: " + strawberry.price());
                    totalPrice += strawberry.price();
                    System.out.println("Total price: " + totalPrice);
                    break;
                case 2:
                    System.out.print("Enter quantity: ");
                    pear.quantity(keyboard.nextDouble());
                    System.out.print("Enter price: ");
                    pear.kilogramPrice = keyboard.nextDouble();
                    pear.fruitName();
                    System.out.println(" price: " + pear.price());
                    totalPrice += pear.price();
                    System.out.println("Total price: " + totalPrice);
                    break;
                case 3:
                    System.out.print("Enter quantity: ");
                    apple.quantity(keyboard.nextDouble());
                    System.out.print("Enter price: ");
                    apple.kilogramPrice = keyboard.nextDouble();
                    apple.fruitName();
                    System.out.println(" price: " + apple.price());
                    totalPrice += apple.price();
                    System.out.println("Total price: " + totalPrice);
                    break;
                case 4:
                    System.out.print("Enter quantity: ");
                    watermelon.quantity(keyboard.nextDouble());
                    System.out.print("Enter price: ");
                    watermelon.kilogramPrice = keyboard.nextDouble();
                    watermelon.fruitName();
                    System.out.println(" price: " + watermelon.price());
                    totalPrice += watermelon.price();
                    System.out.println("Total price: " + totalPrice);
                    break;
                default:
                    break;
            }

        }

    }
}
