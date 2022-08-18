package logic;

import logic.TypeProduct.TypeProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailTest {
    Detail detail;

    void setup() {
        Product product = new Product("1", "Viveras", 3500, 10, (byte)10,
                TypeProduct.VIVERES);
        Detail detail = new Detail(product, (short)10);
    }

    @Test
    void getSubTotal() {
        setup();
        assertEquals(39_200, detail.getSubTotal());
    }
}