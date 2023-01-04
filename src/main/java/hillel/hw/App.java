package src.main.java.hillel.hw;
import src.main.java.hillel.hw.exception.ArraySizeException;
import src.main.java.hillel.hw.exception.ArrayDataException;


public class App {


    public static class Application {
        public static void main(String[] args) throws ArraySizeException, ArrayDataException {
            String[][] array = {{"1 ", "2", "33", " 4"}, {"  5", " 5", " 7 ", "8"}, {" 9", " 10", "11", "12"}, {"  13", " 14", "15 ", "16"}};


            try {
                System.out.println(ArrayValueCalculator.calculating(array));
            } catch (ArraySizeException | ArrayDataException ex) {
                ex.printStackTrace();
            }
        }
    }
}
