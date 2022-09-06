public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog(24, "HOME", true, "Поддается дрессировке");
        animals[1] = new Cat(44, "HOME", false,"Боиться воды");
        animals[2] = new Horse(224, "outside", true,"Можно оседлать");

        Veterinarian.treatAnimal(animals[0]);
        Veterinarian.treatAnimal(animals[1]);
        Veterinarian.treatAnimal(animals[2]);

    }
}