package Array;

import java.util.ArrayList;
import java.util.List;

public class ProductListFunction {

    public static List<String> productList(String args){
        List<String> productList = new ArrayList<>();

        productList.add(args);
        return productList;
    }
}
