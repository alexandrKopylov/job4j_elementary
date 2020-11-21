package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng){
        return "Неизвестное слово -" + eng;
    }
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String slovo = dic.engToRus("book");
        System.out.println(slovo);
    }
}
