package com.youma;

/**
 * A Camel Application
 *
 * @author czq
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Circle c = new Circle(1);
        c.new Draw().drawSahpe();
        System.out.println("Unique ID: " + c.generateUniqueKey());
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Cat cat = null;
        System.out.println(String.format("是%s",animal instanceof  Animal));
        if (animal instanceof Animal) {
            cat = (Cat) animal;
        }
        animal.run();
        animal1.run();
        System.out.println(Animal.name);
        System.out.println(cat.name);
        // Main main = new Main();
        // main.addRouteBuilder(new MyRouteBuilder());
        // main.run(args);
    }

}

