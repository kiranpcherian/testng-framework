package com.mycompany.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before ShoppingTests class is executed");
    }
    public void afterClass(){
        System.out.println("After ShoppingTest class is executed");
    }

    @Test
    public void productSearch(){
        System.out.println("Searching for a product");

    }
    @Test
    public void addProductToShoppingCart(){
        System.out.println("Adding a product to shopping cart");
    }
}
