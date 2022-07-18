package genericsss;

public class Main {
    public static void main(String[] args) {
        GenericType<Integer> integerGenericType= new GenericType<>(7);
        integerGenericType.showType();
        Integer value = integerGenericType.getObj();
        System.out.println(value);

        GenericType<Double> doubleGenericType= new GenericType<>(5.5);
        doubleGenericType.showType();
        Double valueDouble = doubleGenericType.getObj();
        System.out.println(valueDouble);

        GenericType<String> stringGenericType= new GenericType<>("ali");
        stringGenericType.showType();
        String valueString = stringGenericType.getObj();
        System.out.println(valueString);
    }
}
