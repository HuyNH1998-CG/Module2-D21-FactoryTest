public class FactoryAnimal {
    public Animal getAnimal(String type){
        if(type.equals("canine")){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
