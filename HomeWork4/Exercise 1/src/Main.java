
public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0] = new Book("Duhota","Egorov");
        printables[1] = new Book("Duhota1","Egorov33RUS");
        printables[2] = new Book("Duhota32","Egorov666");
        printables[3] = new Journal("HaveHomeWork");
        printables[4] = new Magazine();


        for (Printable printable : printables){
           printable.print();
        }
       Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
    }
