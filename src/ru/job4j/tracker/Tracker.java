package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод возвращает копию массива this.items без null элементов
     * @return  возвращает копию массива this.items без null элементов
     */
    public Item[] findAll(){
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null) {
                itemsWithoutNull [size] = name;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf( itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key
     * @return  возвращает копию массива this.items без null элементов cо значением key
     */
    public Item[] findByName(String key){
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name.getName().equals(key) ) {
                itemsWithoutNull [size] = name;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf( itemsWithoutNull, size);
        return itemsWithoutNull;
    }
    /**
     * Метод проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key
     * @return  возвращает копию массива this.items без null элементов cо значением key
     */
    public Item findById(String id){

        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name.getId().equals(id) ) {
               return  name;
            }
        }
        return null;

    }
}
