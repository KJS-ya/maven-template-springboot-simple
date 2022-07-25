package org.example.java.java_collection.integerlist_to_array;

/**
 * Example: Converting Integer List to Int Array using ArrayUtils.toPrimitive() method
 * For this example, we need an external package org.apache.commons.lang3.ArrayUtils.
 * In some IDE, you can find it already or you need to import it by downloading the JARs file.
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
public class Demo001
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int[] arr = ArrayUtils.toPrimitive(list.toArray(new Integer[list.size()]));
        for (int val : arr) {
            System.out.println("int primitive: "+val);
        }
    }
}
