package ru.geekbrains.pr10;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("------------------------Задание 1------------------------");
        ClassArraySetOfWords.arraySetOfWords();
        System.out.println("------------------------Задание 2------------------------");
        ClassPhoneBook phoneBook = new ClassPhoneBook();
        phoneBook.fillPhone();
        System.out.println(phoneBook.get("Абрамов"));
        System.out.println(phoneBook.get("Анисимов"));
        System.out.println(phoneBook.get("Котяев"));
        System.out.println(phoneBook.get("Ибрагимов"));

    }
}
