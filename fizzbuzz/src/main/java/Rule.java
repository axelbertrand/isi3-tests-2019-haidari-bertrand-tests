import java.util.function.IntPredicate;

public class Rule {
    private IntPredicate predicate;
    private String value;

    public Rule(IntPredicate predicate, String value) {
        this.predicate = predicate;
        this.value = value;
    }

    public String apply(String previous) {
        try {
            if (predicate.test(Integer.parseInt(previous))) {
                return value;
            }
        }
        catch (NumberFormatException e){
            return previous;
        }

        return previous;
    }
}
