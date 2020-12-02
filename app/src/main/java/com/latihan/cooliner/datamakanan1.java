package com.latihan.cooliner;

import java.util.ArrayList;

public class datamakanan1 {
    private static String[] foodNames = {
            "Nasi Pecel",
            "Bakso",
            "Rujak Cingur",
            "Nasi Krawu",
            "Lontong Balap",
            "Madu Mongso",
            "Wedang Angsle",

    };

    private static String[] foodLocation = {
            "Madiun",
            "Malang",
            "Surabaya",
            "Gresik",
            "Surabaya",
            "Ponorogo",
            "Malang",

    };

    private static int[] foodImages = {
            R.drawable.jt_nasipecel,
            R.drawable.jt_bakso,
            R.drawable.jt_rujakcingur,
            R.drawable.jt_nasikrawu,
            R.drawable.jt_lontongbalap,
            R.drawable.jt_madu,
            R.drawable.jt_wedangangsle,

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
