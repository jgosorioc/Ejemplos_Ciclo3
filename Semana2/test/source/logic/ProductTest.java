package logic;

import logic.TypeProduct.TypeProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getIVA() {
        Product product = new Product("1", "Viveras", 2500, 10, (byte)10,
                TypeProduct.VIVERES);
        assertEquals(300, product.getIVA());
    }
}