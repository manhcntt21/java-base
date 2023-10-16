package a1generictype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manhdt14
 * created in 12/21/2022 2:31 PM
 */
public class BoxDemo {
    public static <U> void addBox(U u, List<BoxGeneric<U>> boxes) {
        BoxGeneric<U> box = new BoxGeneric<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<BoxGeneric<U>> boxes) {
        int counter = 0;
        for (BoxGeneric<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        ArrayList<BoxGeneric<Integer>> listOfIntegerBoxes = new ArrayList<>();
        BoxDemo.addBox(Integer.valueOf(1), listOfIntegerBoxes);
        // tuong đương với cái dưới
        // generictype.BoxDemo.<Integer>addBox(Integer.valueOf(1), listOfIntegerBoxes);

        BoxDemo.addBox(Integer.valueOf(2), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(3), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(4), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(5), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}
