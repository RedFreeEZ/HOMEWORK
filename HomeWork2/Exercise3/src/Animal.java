public class Animal {
    int food;
    String location;
    boolean Sleep;
    String differentCharacteristics;

    Animal(int food, String location, boolean Sleep, String differentCharacteristics){
        this.food=food;
        this.location=location;
        this.Sleep=Sleep;
        this.differentCharacteristics = differentCharacteristics;
    }

    public void makeNoise(){
        if(Sleep)
        {System.out.println("Sleep");}
        else
        {System.out.println("Звук");}
    }
    public void eat(int CountFood){
        this.food = CountFood;
    }
    public void sleep(){this.Sleep = true;}

    public int getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}
