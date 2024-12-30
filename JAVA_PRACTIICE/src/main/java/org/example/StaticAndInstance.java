package org.example;

public class StaticAndInstance {
    public static void main(String[] args){
        display();
        StaticAndInstance obj = new StaticAndInstance();
        obj.show();
    }
    static void display(){
        System.out.println("this is static method");
    }
    void show(){
        System.out.println("Instance method");
    }
}
