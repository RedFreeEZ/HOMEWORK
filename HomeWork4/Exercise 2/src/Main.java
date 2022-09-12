public class Main {
    public static void main(String[] args) {
       Tool[] tools = new Tool[4];
        tools[0] = new Drum(10);
        tools[1] = new Guitar(22);
        tools[2] = new Tube(33);
        tools[3] = new Tube(22);

        for(Tool tool:tools){
            tool.play();
        }
    }
}