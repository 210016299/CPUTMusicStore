/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.test.respository;

import com.joseph.california.app.conf.ConnectionConfig;
import com.joseph.california.domain.Customer;
import com.joseph.california.domain.Owner;
import com.joseph.california.respository.CustomerRepository;
import com.joseph.california.respository.OwnerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bradleyJoseph
 */

public class OwnerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private OwnerRepository repo;
    
    public OwnerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         repo = ctx.getBean(OwnerRepository.class);
         Owner owner = new Owner();
         owner.setFirstname("Norman");
         repo.save(owner);
         Assert.assertNotNull(owner);
     
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        	 ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
		
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
