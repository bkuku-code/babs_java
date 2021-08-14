package com.CaptainCook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    private Invoice realInvoice;
    @BeforeEach
    void setUp() {
        realInvoice = new Invoice("64", "Engine", 2, 200);

    }

    @Test
    void displayPartNumber() {
        assertEquals("64", realInvoice.getPartNumber());
    }

    @Test
    void displayPartDescription() {
        assertEquals("Engine" ,realInvoice.getPartDescription());
    }

    @Test
    void displayItemQuantityPurchase() {
        assertEquals(2 , realInvoice.getItemQuantityPurchase());
    }
    

    @Test
    void displayItemPrice() {
        assertEquals(200, realInvoice.getItemPrice());
    }


}