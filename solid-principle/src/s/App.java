package s;

/**
 * @author manhdt14
 * created in 9/29/2022 2:01 AM
 */
public class App {
    public static void main(String[] args) {
        GoodBook gb = new GoodBook("Mai Mai Tuoi 20", "Nguyen Van Thac", "Nhat Ky");
        BookPrinter bp = new BookPrinter();

        bp.printTextToConsole(gb.getText());

        TextManipulator  t = new TextManipulator("Michael");
        TextPrinter tp = new TextPrinter(t);
        tp.printText();

    }
}
