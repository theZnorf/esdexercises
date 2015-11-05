/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exam1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerTest {

    
    
    @Test
    public void testCreateDifferentStringTokenizer() {
        final String testData = "Hello Test";
        final String testDelim = ",";

        StringTokenizer simpleTokenizer = new StringTokenizer(testData);
        assertNotNull(simpleTokenizer);

        StringTokenizer delimTokenizer = new StringTokenizer(testData,
                testDelim);
        assertNotNull(delimTokenizer);
    }

    @Test
    public void testCountTokensWithThreeWordString() {
        final String[] words = { "hello", "out", "there" };
        String testData = "";
        for (String str : words)
            testData += str + " ";

        StringTokenizer tokenizer = new StringTokenizer(testData);
        assertNotNull(tokenizer);

        assertEquals(words.length, tokenizer.countTokens());
    }

    @Test
    public void testNextTokenAndHasMoreTokensWithThreeWordString() {
        final String[] words = { "hello", "out", "there" };
        String testData = "";
        for (String str : words)
            testData += str + " ";

        StringTokenizer tokenizer = new StringTokenizer(testData);
        assertNotNull(tokenizer);

        for (int i = 0; i < words.length; i++) {
            assertTrue("tokenizer does not have more tokens at iteration "
                    + String.valueOf(i), tokenizer.hasMoreTokens());
            assertEquals(
                    "tokenizer return invalid token at iteration "
                            + String.valueOf(i),
                    words[i], tokenizer.nextToken());
        }
    }

    @Test
    public void testCountTokensWithThreeWordStringSeperatedByComma() {
        final String[] words = { "hello", "out", "there" };
        final String delim = ",";
        String testData = "";
        for (String str : words)
            testData += str + delim;

        StringTokenizer tokenizer = new StringTokenizer(testData, delim);
        assertNotNull(tokenizer);

        assertEquals(words.length, tokenizer.countTokens());
    }

    @Test
    public void testNextTokenAndHasMoreTokensWithThreeWordStringSeperatedByComma() {
        final String[] words = { "hello", "out", "there" };
        final String delim = ",";
        String testData = "";
        for (String str : words)
            testData += str + delim;

        StringTokenizer tokenizer = new StringTokenizer(testData, delim);
        assertNotNull(tokenizer);

        for (int i = 0; i < words.length; i++) {
            assertTrue("tokenizer does not have more tokens at iteration "
                    + String.valueOf(i), tokenizer.hasMoreTokens());
            assertEquals(
                    "tokenizer return invalid token at iteration "
                            + String.valueOf(i),
                    words[i], tokenizer.nextToken());
        }
    }

    @Test
    public void testNextTokenWithThreeWordStringUsingChangingDelimiter() {
        final String[] words = { "hello", "out", "there" };
        String testData = "";
        for (String str : words)
            testData += str + " ";

        StringTokenizer tokenizer = new StringTokenizer(testData);
        assertNotNull(tokenizer);

        assertEquals(words[0], tokenizer.nextToken());
        assertEquals(" o", tokenizer.nextToken("u"));
        assertEquals("t there ", tokenizer.nextToken());
    }

}
