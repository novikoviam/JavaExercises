package com.novikoviam;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PracticeList names = new PracticeList(new String[]{"Vladimir","Arina","Eugen","Olga","Ekaterina","George"});
        System.out.println(names.search("Vladimir")?"contains":"nope");
        names.addNewName("Vadim");
        System.out.println(names);


        }
}
