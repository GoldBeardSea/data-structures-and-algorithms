package Challenges.StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void test_multiBracketValidator_happy() {
        String test = "()[]{}Hello{}()[]";
        Boolean testMethod = MultiBracketValidation.multiBracketValidator(test);
        assertTrue(testMethod);
    }

    @Test
    public void test_multiBracketValidator_happyGrouped() {
        String test = "(C)[B]{A}Hello{D}(E)[F]";
        Boolean testMethod = MultiBracketValidation.multiBracketValidator(test);
        assertTrue(testMethod);
    }

    @Test
    public void test_multiBracketValidator_failureSimple() {
        String test = "(The}{}()";
        Boolean testMethod = MultiBracketValidation.multiBracketValidator(test);
        assertFalse(testMethod);
    }

    @Test
    public void test_multiBracketValidator_failureLarge() {
        String test = "(The{}{}{}()()()()()()()()()()()()()[][][][]][][][]]]][[[[]]]}{}()";
        Boolean testMethod = MultiBracketValidation.multiBracketValidator(test);
        assertFalse(testMethod);
    }

    @Test
    public void test_multiBracketValidator_failureConditionGamma() {
        String test = "}(){}[]";
        Boolean testMethod = MultiBracketValidation.multiBracketValidator(test);
        assertFalse(testMethod);
    }
}