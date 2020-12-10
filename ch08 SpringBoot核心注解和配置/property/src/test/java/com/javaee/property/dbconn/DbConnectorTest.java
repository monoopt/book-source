package com.javaee.property.dbconn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DbConnectorTest {
    @Autowired
    DbConnector dbConnector;

    @Test
    public void test(){
        dbConnector.config();
    }

}