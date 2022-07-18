package wildcard;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumericOperations<Double> doubleNumericOperations = new NumericOperations<>(13.0);
        ArrayList<Integer> strings=new ArrayList<>();
        strings.add(2);
        strings.add(-13);
        doubleNumericOperations.absEqual(strings);

    }
}
