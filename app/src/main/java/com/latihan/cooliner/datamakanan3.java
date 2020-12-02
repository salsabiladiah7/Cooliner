package com.latihan.cooliner;

import java.util.ArrayList;

public class datamakanan3 {
    private static String[] foodNames = {
            "Mie Kocok",
            "Soto Kuning",
            "Nasi Jamblang",
            "Nasi Lengko",
            "Soto Mie",
            "Kue Bandros",
            "Es Cendol",

    };

    private static String[] foodLocation = {
            "Bandung",
            "Bogor",
            "Cirebon",
            "Cirebon",
            "Bogor",
            "Sukabumi",
            "Bandung",

    };

    private static int[] foodImages = {
            R.drawable.jb_miekocok,
            R.drawable.jb_sotokuning,
            R.drawable.jb_jamblang,
            R.drawable.jb_lengko,
            R.drawable.jb_sotomie,
            R.drawable.jb_bandros,
            R.drawable.jb_cendol,

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
