public class Cat extends Animal {
                public Cat(int food, String location,boolean Sleep, String differentCharacteristics ){
                        super(food, location, Sleep, differentCharacteristics);}

                @Override
                public void makeNoise(){
                        if(Sleep = true)
                        {System.out.println("Cat Sleep");}
                        else
                        {System.out.println("Cat Life");}

                }
        }

