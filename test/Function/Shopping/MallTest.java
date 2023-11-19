package Function.Shopping;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MallTest {
    @Test

    void testTotal(){
        ShoppersCart cart = new ShoppersCart();
        ArrayList<ShoppersCart> shoppersCarts = new ArrayList<>();

        cart.setProductBought("Yam");
        cart.setPrice(2100.00);
        shoppersCarts.add(cart);
        cart.setQuantity(2);
        shoppersCarts.add(cart);


        cart.setProductBought("goat");
        cart.setPrice(550.00);
        shoppersCarts.add(cart);
        cart.setQuantity(2);
        shoppersCarts.add(cart);


       assertEquals(5300.00,Mall.getTotal(shoppersCarts));


    }

}