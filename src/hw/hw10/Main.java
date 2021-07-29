package hw.hw10;

public abstract class Main {

    public static void main(String[] args) {
        Vet veterinarian = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости", "Двор");
        animals[1] = new Cat("Молоко", "Квартира");
        animals[2] = new Horse("Сено", "Иподром");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
//В методе main создайте массив типа Animal, в который запишите животных всех
// имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
