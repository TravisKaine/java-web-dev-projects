package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "only a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void singleBracketsBefore() {
        String message = "balanced brackets in front of the other characters";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAroundCharacters() {
        String message = "balanced brackets around other characters";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsWithOtherCharacters() {
        String message = "balanced brackets with other characters";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleSetBrackets() {
        String message = "three pair of brackets";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void nestedBalancedBrackets() {
        String message = "brackets inside other brackets";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleOpenBracket() {
        String message = "a single open bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleCloseBracket() {
        String message = "a single closing bracket returns false";
        String testData ="]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }

    @Test
    public void wrongOrderBracket() {
        String message = "a set reversed open bracket returns false";
        String testData ="][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }

    @Test
    public void singleBreacketWithOthers() {
        String message = "a single open bracket with other characters returns false";
        String testData ="[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }

    @Test
    public void unbalancedBracketsAmoungOtherCharacters() {
        String message = "a unbalanced bracket with other characters returns false";
        String testData ="Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }

    @Test
    public void mixedUnbalancedBrackets() {
        String message = "mixed unbalanced bracket returns false";
        String testData ="[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }

    @Test
    public void CharacterWithoutBrackets() {
        String message = "a string of characters without brackets";
        String testData ="LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }

    @Test
    public void emptyString() {
        String message = "a empty string returns true";
        String testData ="";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }

}





