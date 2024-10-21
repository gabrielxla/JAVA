public class Teste {
    public static void main(String[] args) {
      // Create integer variables
      int length = 4;
      int width = 6;
      int area;

      int itens = 50;
      float custoporitem = 9.99f;
      float custototal = itens * custoporitem;
      char moeda = '$';
  
      // Calculate the area of a rectangle
      area = length * width;
  
      // Print variables
      System.out.println("Length is: " + length);
      System.out.println("Width is: " + width);
      System.out.println("Area of the rectangle is: " + area);
      
      System.out.println("TOTAL = " + custototal+moeda );

    }
  }
  