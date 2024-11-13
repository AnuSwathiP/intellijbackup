package staragile.collectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class D03ListDemo3 {
    public static void main(String[] args) {
        List<String> st = new Vector<>() ;
        st.add("one");
        st.add("two");
        st.add("three");
        System.out.println(st);
    }
}
