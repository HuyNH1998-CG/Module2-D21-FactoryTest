public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("canine");
        System.out.println("sound " + animal1.makeSound());
        Animal animal2 = factoryAnimal.getAnimal("feline");
        System.out.println("sound " + animal2.makeSound());
    }
}
