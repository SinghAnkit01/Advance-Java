import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regular {
    public static void main(String[] args) {
        // String regex = ".*[a-z][0-9].";
        // Pattern pattern = Pattern.compile(regex);
        // // compiling string using Pattern.compile() pre-defined method.
        // Matcher matcher = pattern.matcher("1230827272AA");
        // // use patternclass-object.matcherclass-object to match the given expression.
        // boolean match = matcher.find();
        // // matcher.find() method will match the given expression through regularExpression and stored it to match variable.
        // if(match){
        //     System.out.println("Match Found");
        // }else{
        //     System.out.println("Match does not found");
        // }
        // String regex = "^[.*][a-z][.*][@][gmail][.com]";
        String regex = "[a-z][0-9][0-9][@][g][m][a][i][l][.][c][o][m]";
    //    [0-9] this is for a single digit
    // [a-z] this is for multiple character.
        Pattern pattern = Pattern.compile(regex);
        // Matcher matcher = pattern.matcher("ab22@gmail.com");
        // Matcher matcher1 = pattern.matcher("ab11@gmail.com");
        Matcher matcher1 = pattern.matcher("abgdgd73@gmai.com");
        boolean match = matcher1.find();
        if(match){
                System.out.println("Match Found");
            }else{
                System.out.println("Match does not found");
            }
    }
}
