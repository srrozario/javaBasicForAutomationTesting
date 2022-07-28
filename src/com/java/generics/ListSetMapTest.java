package com.java.generics;

/* In this class and ListSetMapMain class generics list,set and map interface will be demonstrated.
A class that can refer to any type is known as a generic class.
 */


public class ListSetMapTest <T>{
    T obj;
    ListSetMapTest(T obj){
        this.obj=obj;
    }
    public T obj(){
        return this.obj;
    }
}