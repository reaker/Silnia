package Testuj;

import java.io.StringReader;


public interface CHelper<T> {

    T makeObject (String s);

    String makeString();

    boolean isNotUpToDate();

}
