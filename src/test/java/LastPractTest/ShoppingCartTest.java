package LastPractTest;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest extends BaseTest
{
ShoppingCartPage shoppingCart;


@BeforeEach
public void setUpPage(){
    shoppingCart = new ShoppingCartPage(driver);
    shoppingCart.open();


}

@Test
    public void testAddItemToShoppingCart(){
    shoppingCart.LinkLogin();
}
@Test
public void testVisibleCoutryUSA(){

    String country = "South Africa";
    shoppingCart.SelectCountry(country);
    String selectedCountry = shoppingCart.getSelectedCountry();
    Assertions.assertEquals(country, selectedCountry);
}
}
