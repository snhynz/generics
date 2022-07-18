package mapgenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Key : ");
        String key= scanner.next();
        System.out.print("Enter Value : ");
        Integer value=scanner.nextInt();
        KeyValuePair<String,Integer> keyValuePair=new KeyValuePair<>(key,value);
        System.out.println(keyValuePair.getKey());
        System.out.println(keyValuePair.getValue());
        System.out.println(keyValuePair.displayInfo());

        Thread keyThread = new Thread(new MyRunnable());
        Thread valueThread = new Thread(new MyRunnable());

        KeyValuePair<Thread,Thread> threadThreadKeyValuePair=new KeyValuePair<>();
        threadThreadKeyValuePair.setKey(keyThread);
        threadThreadKeyValuePair.setValue(valueThread);
        threadThreadKeyValuePair.getKey().start();
        threadThreadKeyValuePair.getValue().start();
        System.out.println(threadThreadKeyValuePair.displayInfo());
    }
}
