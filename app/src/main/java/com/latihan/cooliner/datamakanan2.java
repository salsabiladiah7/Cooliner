package com.latihan.cooliner;

import java.util.ArrayList;

public class datamakanan2 {
    private static String[] foodNames = {
            "Soto Kudus",
            "Nasi Liwet",
            "Nasi Grombyang",
            "Nasi Gandul",
            "Mie Ongklok",
            "Lumpia",
            "Dawet Ireng",

    };

    private static String[] foodLocation = {
            "Kudus",
            "Solo",
            "Pemalang",
            "Pati",
            "Wonosobo",
            "Semarang",
            "Purworejo",

    };

    private static int[] foodImages = {
            R.drawable.jtn_sotokudus,
            R.drawable.jtn_nasiliwet,
            R.drawable.jtn_nasigrombyang,
            R.drawable.jtn_nasigandul,
            R.drawable.jtn_mieongklok,
            R.drawable.jtn_lumpia,
            R.drawable.jtn_dawetireng,

    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodLocation[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
