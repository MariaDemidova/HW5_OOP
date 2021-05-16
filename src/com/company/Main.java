package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] personArr = new Person[5];
        personArr[0] = new Person("Петров Петр Васильевич", "дворник", "petro@yandex.ru", "8945459912", 10000, 35);
        personArr[1] = new Person("Петросян Валерий Леонтьевич", "Дворник", "pedros@yandex.ru", "8945459912", 5000, 65);
        personArr[2] = new Person("Васильев Василий Васильевич", "оператор", "vas@yandex.ru", "8967679912", 20000, 40);
        personArr[3] = new Person("Дуркин Михаил Константинович", "начальник отдела", "dur@yandex.ru", "89876789126", 40000, 38);
        personArr[4] = new Person("Пугачева Алла Борисовна", "бухгалтер", "alla@yandex.ru", "8945459912", 5000, 88);
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getAge() >= 40) personArr[i].showInfo();
        }
    }
}
