package com.CaptainCook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    void displayFirstName() {
        Employee realEmployee = new Employee("Tunde", "KUKU", 2300.00);
        assertEquals("Tunde" ,Employee.getFirstName());
    }

    @Test
    void getLastName() {
        Employee realEmployee = new Employee("Tunde", "KUKU", 2300.00);
        assertEquals("KUKU" ,Employee.getLastName() );
    }

    @Test
    void getSalary() {
        Employee realEmployee = new Employee("Tunde", "KUKU", 2300.00);
        assertEquals(2300.00*10/100 ,Employee.getSalary());
    }

}

