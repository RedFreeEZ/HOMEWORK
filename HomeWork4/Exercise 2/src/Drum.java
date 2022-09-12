public class Drum implements Tool{
   int Size;
   public int getSize() {
      return Size;
   }
   Drum( int Size){ this.Size = Size;}


   public void setSize(int size) {
      this.Size = size;
   }

   @Override
   public void play() {
      System.out.printf("Играет барабан, размер: %s %s", Size, " || ");
   }

   @Override
   public String toString() {
      return "Drum{" +
              "size='" + Size + '\'' +
              '}';
   }
}
