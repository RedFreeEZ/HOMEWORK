public class Magazine implements Printable{
    static void printMagazines(Printable[] printables){
        for (Printable p: printables) {
            if (p instanceof Magazine)
                p.print();
        }
    }
    public void print() {
        System.out.println("iS magazine");
    }
}
