package day09.demo02;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:38
 */
public class Demo02Interface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animalA = cat;
        Animal animalB = dog;
        method(animalA);
        method(animalB);
    }

    public static void method(Animal animal) {
        animal.eat();
        animal.sleep();
    }

}
