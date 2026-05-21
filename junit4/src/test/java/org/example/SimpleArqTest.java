package org.example;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class SimpleArqTest {

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println(">>> JUnit4 @BeforeClass executed - thread: " + Thread.currentThread().getName());
    }

    @Before
    public void before() {
        System.out.println(">>> JUnit4 @Before executed - thread: " + Thread.currentThread().getName());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(">>> JUnit4 @AfterClass executed - thread: " + Thread.currentThread().getName());
    }

    @After
    public void after() {
        System.out.println(">>> JUnit4 @After executed - thread: " + Thread.currentThread().getName());
    }

    @Test
    public void shouldRun() {
        Assert.assertTrue(true);
        System.out.println(">>> JUnit4 @Test executed - thread: " + Thread.currentThread().getName());
    }
}
