package com.java.generics;

import java.util.*;

/* List interface in Java is a sub-interface of the Java collections interface.
It contains the index-based methods to insert, update, delete, and search the elements.
It can have duplicate elements also.
 */
public class ListSetMapMain {
    public static void main(String[] args) {
        //predefined generic integer type list interface
        List<Integer> integers = Arrays.asList(15, 20, 22);
        //using for-each loop
        for (Integer integerTest : integers
        ) {
            System.out.println("Printing predefined generic integer type list interface " + integerTest);
        }

        //predefined generic string type list interface
        List<String> string = Arrays.asList("Field1", "Field2");
        //printing generic string type list index value 1
        System.out.println("printing predefined generic string type list index value 1: " + string.get(1));
        for (String stringTest : string
        ) {
            //printing generic string type list interface values
            System.out.println("Printing predefined generic string type list: " + stringTest);
        }

        //non predefined generic integer type list interface
        List<Integer> integersList = new ArrayList<>();
        //adding index values
        integersList.add(100);
        integersList.add(200);
        integersList.add(300);
        //replacing index 1
        integersList.remove(1);
        //replacing index 2 with new value 500
        integersList.add(2, 500);
        //using for-each loop
        for (Integer integerTest2 : integersList) {
            System.out.println("Printing non predefined generic integer type list interface: " + integerTest2);
        }
/* The Set follows the unordered way and it found in java.util package and extends the collection interface in java.
Duplicate item will be ignored in Set and it will not print in the final output.
 */
        //non predefined generic integer type set interface
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Sajib");
        stringSet.add("Rozario");
        //adding duplicate value
        stringSet.add("Rozario");
        //removing value
        stringSet.remove("Sajib");
        for (String str : stringSet
        ) {
            System.out.println("Printing non predefined generic integer type set interface: " + str);
        }
/* The Java Map interface, java.util.Map represents a mapping between a key and a value. More specifically,
a Java Map can store pairs of keys and values. Each key is linked to a specific value. Once stored in a Map,
you can later look up the value using just the key.
 */
        //generic string type map interface
        Map<String, Object> stringObjMap = new HashMap<>();
        //// adding the key and value
        stringObjMap.put("Name", "sajib");
        stringObjMap.put("ID", 233244);
        //printing value
        System.out.println("Printing value: " + stringObjMap);
    }
}