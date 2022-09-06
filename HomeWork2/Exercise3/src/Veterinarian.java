public class Veterinarian {
    public static void treatAnimal(Animal animal){
        String NEXT = "||";
        System.out.printf(" Еда: %s ", animal.getFood());
        System.out.printf(" Место обитания: %s %s ", animal.getLocation(), NEXT);
    }
}
