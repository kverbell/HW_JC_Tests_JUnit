import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class IllegalArgumentTest {

    private GroceryBasket basket;

    @BeforeEach
    void setUp() {
        basket = new GroceryBasket();
    }

    @Test
    void testDoStorageWithInvalidProductNumber() {
        try {
            basket.setProducts(5, 3); //продукт №5 не существует
            Assertions.fail("Ожидалось исключение IllegalArgumentException, но его не было выброшено.");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректный номер продукта.", e.getMessage());
        }
    }
}
