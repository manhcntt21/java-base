package cloneableinterface;

/**
 * @author manhdt14
 * created in 9/27/2023 3:52 PM
 */
public class Tree implements Cloneable {
    private double mass;
    private double height;
    private Position2 position;

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPosition(Position2 position) {
        this.position = position;
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public Position2 getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Tree [mass=" + mass + ", height=" + height + ", position=" + position + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Tree cloned = (Tree) super.clone();
        cloned.setPosition(new Position2(cloned.getPosition().getX(), cloned.getPosition().getY()));
        return cloned;
    }
}
