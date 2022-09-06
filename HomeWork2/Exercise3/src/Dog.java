public class Dog extends Animal{
    public Dog(int food, String location,boolean Sleep, String differentCharacteristics ){
        super(food, location, Sleep, differentCharacteristics);}


    @Override
        public void makeNoise(){
            if(Sleep = true)
            {System.out.println("Dog Sleep");}
            else
            {System.out.println("Dog Life");}

    }
}
