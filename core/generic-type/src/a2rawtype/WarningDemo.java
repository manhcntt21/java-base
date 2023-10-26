package a2rawtype;

/**
 * @author manhdt14
 * created in 12/21/2022 3:32 PM
 */
@SuppressWarnings("unchecked")
public class WarningDemo {
    static Box createBox(){
        return new Box();
    }
    public static void main(String[] args){
        Box<Integer> bi;
        bi = createBox();
    }
}
