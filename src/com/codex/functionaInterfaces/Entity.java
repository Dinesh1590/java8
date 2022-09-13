package com.codex.functionaInterfaces;

import practise.DummyClass;
public class Entity implements Cloneable {
    int i;
    int j;

    public static void main(String[] args) throws CloneNotSupportedException {

        Entity a = new Entity();
        a.i = 10;
        a.j = 20;

        Entity b = new Entity();
        b.i = a.i;
        b.j = a.j;

        Entity c = (Entity) a.clone();
        System.out.println(c.i + " " + c.j);

        DummyClass dummyClass = new DummyClass();
        dummyClass.i = 11;
        dummyClass.j = 22;

        DummyClass dummyClass1 = (DummyClass) dummyClass.clone();
        System.out.println(dummyClass1.i + " " + dummyClass1.j);
    }
}
