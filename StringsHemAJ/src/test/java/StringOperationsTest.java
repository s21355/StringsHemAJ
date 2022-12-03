import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class StringOperationsTest {
    private static StringOperations stringOperations;

    // Init stringOperations
    @BeforeAll
    public static void setUp() {
        stringOperations = new StringOperations();
    }

    @Test
    public void testReverseText() {
        String input = "mice";
        String reverse = stringOperations.reverse(input);
        assertThat("ecim", Matchers.allOf(Matchers.is(reverse),Matchers.not(input), Matchers.startsWith("ec"), Matchers.notNullValue(), Matchers.stringContainsInOrder("ecim")  ));
    }

    @Test
    public void testConcat() {
        String input1 = "John";
        String input2 = "Doe";
        String concat = stringOperations.concat(input1, input2);
        assertThat("JohnDoe", Matchers.allOf(Matchers.is(concat),Matchers.not("John Doe"), Matchers.startsWith("J"), Matchers.notNullValue(), Matchers.stringContainsInOrder("JohnDoe")));
    }

    @Test
    public void testPalindrom() {
        String input = "hannah";
        boolean palindrome = stringOperations.isPalindrome(input);
        assertThat(true, Matchers.allOf(Matchers.is(palindrome),Matchers.not(false), Matchers.notNullValue()));
    }

    @Test
    public void testReverseAssertText(){
        String reverse = stringOperations.reverse("mice");
        assertThat(reverse).startsWith("ec").endsWith("im").hasSize(4).contains("ecim").isEqualTo("ecim").doesNotContainAnyWhitespaces();
    }

    @Test
    public void testAssertConcat() {
        String concat = stringOperations.concat("Jan", "Kowalski");
        assertThat(concat).startsWith("Ja").isEqualTo("JanKowalski").hasSize(11).doesNotContainAnyWhitespaces().isNotEmpty();
    }

    @Test
    public void testAssertPalindrom() {
        boolean palindrome = stringOperations.isPalindrome("kajak");
        assertThat(palindrome).isTrue().isNotNull().isEqualTo(true).isNotEqualTo(false);
    }

    //Clear
    @AfterAll
    static void tearDown() {
        stringOperations = null;
    }
}
