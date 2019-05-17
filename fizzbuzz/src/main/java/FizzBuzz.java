import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    private IntStream integerList;
    private static List<Rule> rules = new ArrayList<>();

    static {
        /** Règle 6 */
        rules.add(new Rule(n -> n == 42, "La grande question sur la vie, l'univers et le reste"));
        /** Règle 2 */
        rules.add(new Rule(n -> n % 3 == 0, "Fizz"));
        /** Règle 4 */
        rules.add(new Rule(n -> n % 3 == 0 && n % 5 == 0, "Fizz Buzz"));
        /** Règle 3 */
        rules.add(new Rule(n -> n % 5 == 0, "Buzz"));
        /** Règle 5 */
        rules.add(new Rule(n -> n % 7 == 0, "It's a trap"));
    }

    public FizzBuzz(Integer length) {
        assert length >= 0 : "length should not be negative";
        integerList = IntStream.rangeClosed(0, length - 1);
    }

    public IntStream getIntegerList() {
        return integerList;
    }

    public List<String> fizzBuzz() {
        return integerList
                .mapToObj(String::valueOf)
                .map(FizzBuzz::applyAll)
                .collect(toList());
    }

    private static String applyAll(String n) {
        String answer = n;
        for(Rule rule : rules) {
            answer = rule.apply(answer);
        }

        return answer;
    }
}
