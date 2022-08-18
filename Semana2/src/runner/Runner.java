package runner;

import logic.Product;
import logic.TypeProduct.TypeProduct;

public class Runner {
    public static void main(String[] args) {
        Product product = new Product("1", "Viveras", 2500, 10, (byte)10,
                TypeProduct.VIVERES);
    }
}

