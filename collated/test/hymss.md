# hymss
###### \java\seedu\address\model\person\BirthdayTest.java
``` java
public class BirthdayTest {

    @Test
    public void isValidBirthday() {
        // invalid formats for birthdays
        assertFalse(Birthday.isValidBirthday("")); // empty string
        assertFalse(Birthday.isValidBirthday(" ")); // spaces only
        assertFalse(Birthday.isValidBirthday("01011901")); // no forward slashes between digits
        assertFalse(Birthday.isValidBirthday("first/dec/nineteen-ninety-three")); // non-numeric
        assertFalse(Birthday.isValidBirthday("01/jan/1901")); // alphabets within digits
        assertFalse(Birthday.isValidBirthday("22/ 11/ 10")); // spaces between digits

        // valid formats for birthdays
        assertTrue(Birthday.isValidBirthday("11/11/1993")); // DD/MM/YYYY
        assertTrue(Birthday.isValidBirthday("11/11/93"));   // DD/MM/YY
    }
}
```
