import cloneableinterface.Tree;
import newoperator.PlasticTree;
import cloneableinterface.Position2;
import newoperator.Position;

/**
 * @author manhdt14
 * created in 9/27/2023 3:28 PM
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        testCopyWithoutCloneable();
        testCopyWithCloneable();
    }

    static void testCopyWithoutCloneable() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);

        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        System.out.println(plasticTree.hashCode());
        System.out.println(anotherPlasticTree.hashCode());
        // kết quả nó tạo ra một đối tượng hoàn toàn khác
    }

    static void testCopyWithCloneable() throws CloneNotSupportedException {
        double mass = 10.0;
        double height = 3.7;
        Position2 position = new Position2(3, 7);
        Position2 otherPosition = new Position2(4, 8);
        Tree t = new Tree(mass, height);
        t.setPosition(position);

        Tree t2 = (Tree) t.clone();

//        System.out.println(t.hashCode() + " " + t2.hashCode());
//        // default clone is shallow copy
//        System.out.println(t.getPosition() == t2.getPosition()); // true, cung tro den mot dia chi nho
        System.out.println(t.getPosition() == t2.getPosition());

    }
}
