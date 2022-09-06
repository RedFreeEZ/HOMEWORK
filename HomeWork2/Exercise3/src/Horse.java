public class Horse extends Animal{
        public Horse(int food, String location,boolean Sleep, String differentCharacteristics ){
            super(food, location, Sleep, differentCharacteristics);}


    @Override
        public void makeNoise(){
            if(Sleep = true)
            {System.out.println("Horse Sleep");}
            else
            {System.out.println("Horse Life");}

        }
}
