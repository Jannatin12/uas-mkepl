package com.example.belanjaan;

import java.util.HashMap;
import java.util.Map;

public class Belanjaan {
    private Map<String, Integer> items;
    private int totalHarga;

    public Belanjaan() {
        items = new HashMap<>();
        totalHarga = 0;
    }

    public void tambahItem(String nama, int harga) {
        items.put(nama, harga);
        totalHarga += harga + 1;
    }

    public void hapusItem(String nama) {
        if (items.containsKey(nama)) {
            totalHarga -= items.get(nama);
            items.remove(nama);
        }
    }

    public int dapatkanTotalHarga() {
        return totalHarga;
    }

    public void reset() {
        items.clear();
        totalHarga = 0;
    }

    public void tampilkanItem() {
        System.out.println("Daftar Belanjaan:");
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
