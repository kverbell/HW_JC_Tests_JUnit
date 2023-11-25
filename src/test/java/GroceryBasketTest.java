import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GroceryBasketTest {

    private GroceryBasket groceryBasket;

    @BeforeEach
    void setUp() {
        groceryBasket = new GroceryBasket();
    }

    @Test
    void testBuyProductAtIndex1() {
        Assertions.assertDoesNotThrow(() -> {
            groceryBasket.setProducts(1, 3);
            groceryBasket.basket();
        });

        Assertions.assertEquals("Куплен продукт Хлеб на сумму 42 руб. Общая сумма: 42", groceryBasket.basket());
    }
}