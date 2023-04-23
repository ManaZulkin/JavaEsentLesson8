package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        input(animals);
        userToString(animals);
        System.out.println("\nUsers hash codes for animals:");
        userHashCode(animals);
        System.out.println("\nUsers equals result:");
        compare(animals);
    }

    public static void input(Animal[] animals){
        Scanner in = new Scanner(System.in);
        String name, Tail;
        int age;
        boolean tail;
        for (int i = 0; i < animals.length; i++){
            System.out.println("Enter animal name");
            name = in.nextLine();
            System.out.println("Enter animal age");
            age = in.nextInt();
            in.nextLine();
            System.out.println("Does this animal has tail(yes/no)?");
            Tail = in.nextLine().toLowerCase();
            if (Tail.equals("yes")) tail = true;
            else  tail = false;
            animals[i] = new Animal(name, age, tail);
        }
    }
    public static void userToString(Animal[] animals){
        for (int i = 0; i < animals.length; i++){
            System.out.println((i + 1) + ". " + animals[i].toString());
        }
    }
    public static void userHashCode(Animal[] animals){
        for (Animal animal: animals){
            System.out.println(animal.name + " hashCode " + animal.hashCode());
        }
    }

    public static  void compare(Animal[] animals){
        boolean compare = false;
        for (int i = 0; i < animals.length; i++){
            for (int j = 0; j < animals.length; j++){
                if (i != j && j > i){
                    if (animals[i].equals(animals[j])) {
                        System.out.println("Animal " + (i + 1) + " and animal " + (j + 1) + " is the same animal");
                        compare = true;
                    }
                }
            }

        }
        if (!compare) System.out.println("All animals are different");
    }
}
