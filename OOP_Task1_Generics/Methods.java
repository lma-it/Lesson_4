package OOP_Task1_Generics;

// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

/**
 * 
 */
public class Methods {
    public static <U> U getElementFromCollection(List<U> col, int index){
        return col.get(index);
    }

    public static <T1, T2> T2 put(T1 arg1, T2 arg2){
        // Map<Integer, String> hm = new HashMap<>();
        // hm.put(key, vlaue);
        return arg2;
    }
}
