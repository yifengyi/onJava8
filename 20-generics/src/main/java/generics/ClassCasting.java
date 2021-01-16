package generics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class ClassCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args)throws Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0])
        );

        List<Widget> lw2 = List.class.cast(in.readObject());
    }
}
