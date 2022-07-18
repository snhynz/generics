package classifiedgenerics;

public class main {
    public static void main(String[] args) {
        NumericOperation<Integer> integerNumericOperation = new NumericOperation<>();
        integerNumericOperation.setFirstnumber(10);
        integerNumericOperation.setSecondnumber(15);
        System.out.println("Sum : " + integerNumericOperation.sum());

        NumericOperation<Double> doubleNumericOperation = new NumericOperation<>();
        doubleNumericOperation.setFirstnumber(160.5);
        doubleNumericOperation.setSecondnumber(10.5);
        System.out.println("Sum : " + doubleNumericOperation.sum());

    }
}
