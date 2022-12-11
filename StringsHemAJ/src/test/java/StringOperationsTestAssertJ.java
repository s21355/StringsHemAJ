import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StringOperationsTestAssertJ {

    private static StringOperations stringOperations;

    @BeforeAll
    public static void setUp() {
        stringOperations = new StringOperations();
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
