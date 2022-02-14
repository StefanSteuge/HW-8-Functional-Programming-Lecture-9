package com.cursor.Box;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Box {
    public static void main(String[] args) {

        List<Things> thingsList1 = Arrays.asList(
                new Things("First thing", Protector.IS_FRAGILE),
                new Things("Second thing", Protector.IS_NOT_FRAGILE),
                new Things("Third thing", Protector.IS_FRAGILE));
        List<Things> thingsList2 = Arrays.asList(
                new Things("Fourth thing", Protector.IS_NOT_FRAGILE),
                new Things("Fifth thing", Protector.IS_NOT_FRAGILE),
                new Things("Sixth thing", Protector.IS_FRAGILE));
        List<Things> thingsList3 = Arrays.asList(
                new Things("Seventh thing", Protector.IS_FRAGILE),
                new Things("Eighth thing", Protector.IS_NOT_FRAGILE),
                new Things("Ninth thing", Protector.IS_FRAGILE),
                new Things("Tenth thing", Protector.IS_NOT_FRAGILE));

        Collection<List<Things>> boxListMap = Arrays.asList(thingsList1, thingsList2, thingsList3);
        var listStream = boxListMap.stream().toList();
        System.out.println("List of things in boxes: \n" + boxListMap);
    }
}

/*
 4. There is a collection of boxes(Box).
Each box contains a list of some things(Thing). Things may be fragile.
The task is to add extra packing(Protector) for fragile things using streams.
Я розумію завдання так:
Створити колекцію коробок з речима.
Деякі речі в коробках є крихкими.
якщо ми знаходимо таку річ то додаємо її в ще одну коробку.
 */