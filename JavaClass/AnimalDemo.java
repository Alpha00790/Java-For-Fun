class Animal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Cat extends Animal {
    void growl() {
        System.out.println("Meow Meow ! !");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof Woof ! !");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Cat popo = new Cat();
        popo.eat();
        popo.growl();
        Dog bobo = new Dog();
        bobo.sleep();
        bobo.bark();
        Animal monkey = new Animal();
        monkey.eat();
        monkey.sleep();
    }
}
