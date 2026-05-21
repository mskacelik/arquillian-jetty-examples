package org.example;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ArquillianExtension.class)
class SimpleArqTest {

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> JUnit5 @BeforeAll executed - thread: " + Thread.currentThread().getName());
    }

    @BeforeEach
    void beforeEach() {
        System.out.println(">>> JUnit5 @BeforeEach executed - thread: " + Thread.currentThread().getName());
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> JUnit5 @AfterAll executed - thread: " + Thread.currentThread().getName());
    }

    @AfterEach
    void afterEach() {
        System.out.println(">>> JUnit5 @AfterEach executed - thread: " + Thread.currentThread().getName());
    }

    @Test
    void shouldRun() {
        Assertions.assertTrue(true);
        System.out.println(">>> JUnit5 @Test executed - thread: " + Thread.currentThread().getName());
    }
}
