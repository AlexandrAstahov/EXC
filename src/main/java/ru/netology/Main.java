package ru.netology;

public class Main {
    public static void main(String[] args) {


        ProductRepository repo = new ProductRepository();

        repo.add(new Book(1, "Фальшивые зеркала", 320, "Сергей Лукьяненко"));
        repo.add(new Book(2, "Незнайка на луне", 160, "Николай носов"));
        repo.add(new Book(3, "Тревожные люди", 279,"Фредрик Бакман"));
        repo.add(new Book(4, "Заживо в темноте", 367, "Майк Омер"));
        repo.add(new Book(5, "Симон", 349, "Наринэ Абгарян"));
        repo.add(new Book(6, "Дом на краю ночи", 350, "Кэтрин Бэннер"));
        repo.add(new Book(7, "451", 289, "Рэй Брэдбери"));
        repo.add(new Book(8, "Маленький принц", 139, "Антуан де Сент-Экзюпери"));
        repo.add(new Book(9, "Гроздья гнева", 309, "Джон Стейнбек"));




        repo.FindAll();

    }
}
