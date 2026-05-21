package org.example;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ArquillianExtension.class)
class SimpleRepeatedArqTest {

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "repeated-test.war");
    }

    private static int i = 0;

    @RepeatedTest(3)
    void flakyRepeatedTest() {
        boolean result = i++ % 2 == 0;
        System.out.println(">>> Result: " + result);
        Assertions.assertTrue(result);
    }

    @RepeatedTest(3)
    void failingRepeatedTest() {
        Assertions.fail("This test is designed to fail");
    }

    @RepeatedTest(3)
    void successfulRepeatedTest() {
        Assertions.assertTrue(true);
    }
}
