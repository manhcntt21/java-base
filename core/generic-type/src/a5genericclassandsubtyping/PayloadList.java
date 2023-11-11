package a5genericclassandsubtyping;

import java.util.List;

/**
 * @author manhdt14
 * created in 12/21/2022 5:29 PM
 */
public interface PayloadList <E, P> extends List<E> {
    void setPayload(int index, P val);
}
