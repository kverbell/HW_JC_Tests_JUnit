import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PurchaseZeroProductTest {

    private GroceryBasket basket;

    @BeforeEach
    void setUp() {
        basket = new GroceryBasket();
    }

    @Test
    void testPurchaseProductWithIndexZero() {
        basket.setProducts(0, 2); // Покупка продукта с индексом 0
        Assertions.assertEquals("Куплен продукт Молоко на сумму 100 руб. Общая сумма: 100", basket.basket());
    }
}