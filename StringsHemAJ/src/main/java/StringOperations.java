import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public String reverse(@NotNull String a) {
        if (a.length() == 0) throw new NullPointerException();
        List<String> tempArray = new ArrayList<String> (a.length());
        for (int i=0; i< a.length(); i++) {
            tempArray.add(a.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size()-1; i>=0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();

    }

    public String concat(@NotNull String a,@NotNull String b) {
        if (a.length() == 0 && b.length() == 0) throw new NullPointerException();
        String retVal = null;
        if (b.length() > 0 && a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(b);
            retVal = sb.toString();
        }
        return retVal;

    }
    public boolean isPalindrome(@NotNull String a) {
        if (a.length() == 0 ) throw new NullPointerException();
        a = a.toLowerCase();
        int i = 0, j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}