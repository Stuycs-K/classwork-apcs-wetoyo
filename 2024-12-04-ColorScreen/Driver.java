import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        drawBorder();
        int[] randomNumbers = generateRandomNumbers(3, 0, 99);
        displayRandomNumbers(randomNumbers);
        drawSeparator();
        drawMiddleObject();
        
        Text.go(31, 1);
        System.out.println(Text.RESET);
    }

    private static void drawBorder() {
        int rows = 30;
        int cols = 80;
        
        for (int col = 1; col <= cols; col++) {
            Text.go(1, col);
            Text.color(Text.YELLOW, Text.background(Text.BLUE));
            System.out.print("*");
            
            Text.go(rows, col);
            System.out.print("*");
        }
        
        for (int row = 2; row < rows; row++) {
            Text.go(row, 1);
            Text.color(Text.RED, Text.background(Text.CYAN));
            System.out.print("|");
            
            Text.go(row, cols);
            System.out.print("|");
        }
    }

    private static int[] generateRandomNumbers(int size, int min, int max) {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    private static void displayRandomNumbers(int[] numbers) {
        int cols = 80;
        int spacing = cols / (numbers.length + 1);

        Text.go(2, 1);
        for (int i = 0; i < numbers.length; i++) {
            int colPos = (i + 1) * spacing;
            Text.go(2, colPos);

            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }

    private static void drawSeparator() {
        int cols = 80;
        Text.go(3, 1);
        Text.color(Text.BLUE, Text.background(Text.YELLOW));
        for (int col = 1; col <= cols; col++) {
            System.out.print("-");
        }
    }

    private static void drawMiddleObject() {
        int midRow = 15;
        int midCol = 40;

        Text.go(midRow, midCol - 5);
        Text.color(Text.CYAN, Text.background(Text.MAGENTA), Text.BRIGHT);
        System.out.print("Hello, World!");
    }
}
class Text{
//MODIFIERS
public static final int BRIGHT = 1;
public static final int DARK = 2;
public static final int ITALICS = 3;
//COLORS
public static final int BLACK = 30;
public static final int RED = 31;
public static final int GREEN = 32;
public static final int YELLOW = 33;
public static final int BLUE = 34;
public static final int MAGENTA = 35;
public static final int CYAN = 36;
public static final int WHITE = 37;
//CONTROLS
public static final String CLEAR_SCREEN =  "\033[2J";
public static final String HIDE_CURSOR =  "\033[?25l";
public static final String SHOW_CURSOR =  "\033[?25h";

//use this to go back to normal terminal before exiting.
public static final String RESET = "\033[0m"+SHOW_CURSOR;

//use this to convert from color to background (30 to 37 becomes 40 to 47)
public static int  background(int color){
  return color + 10;
}

//terminal specific character to move the cursor to a location
//top left is 1,1
//row is y (higher numbers go down)
//column is x
public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}

//Overloarded color commands (give 1 or more colors/modifiers)
public static void color(int m){
  System.out.print ("\033[;" + m + "m");
}
public static void color(int m1, int m2){
  System.out.print ("\033["+ m1 + ";" + m2 + "m");
}
public static void color(int m1, int m2, int m3){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
}
public static void color(int m1, int m2, int m3, int m4){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
}

//And don't forget you can easily delay the printing if needed:
public static void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}

//erase (black bakground)
public static void erase(int r, int c, int size){
  go(r,c);
  System.out.print("\033[0m");
  for(int i = 0; i < size;i++){
    System.out.print(" ");
  }
}
}