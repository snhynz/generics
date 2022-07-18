package restrictions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        NumericOperator<Double,String,ArrayList<String>> doubleNumericOperator = new NumericOperator<>(5.5,new ArrayList<String>());
        NumericOperator<Integer,String,ArrayList<String>> integerNumericOperator = new NumericOperator<>(120,new ArrayList<String>());

        doubleNumericOperator.getList().add("Ayşe");
        //doubleNumericOperator.addlist(5);
        doubleNumericOperator.printList();

        if (doubleNumericOperator.isDividableByTen()){
            System.out.println(doubleNumericOperator.getObj() + ": 10'a bölünebilir.");
        }
        else{
            System.out.println(doubleNumericOperator.getObj() + ": 10'a bölünemez.");
        }

        integerNumericOperator.getList().add("Ayşe");
        //integerNumericOperator.addlist(5);
        integerNumericOperator.printList();

        if (integerNumericOperator.isDividableByTen()){
            System.out.println(integerNumericOperator.getObj() + ": 10'a bölünebilir.");
        }
        else{
            System.out.println(integerNumericOperator.getObj() + ": 10'a bölünemez.");
        }
    }
}
