package ru.netology;

public class ProductManagerTest {
    ProductManager manager = new ProductManager(new ProductRepository());
    Book book1 = new Book(1, "Фальшивые зеркала", 320, "Сергей Лукьяненко");
    Book book2 = new Book(2, "Незнайка на луне", 160, "Николай носов");
    Book book3 = new Book(3,"Тревожные люди",279,"Фредрик Бакман");
    Book book4 = new Book(4,"Заживо в темноте",367,"Майк Омер");
    Book book5 = new Book(5,"Симон",349,"Наринэ Абгарян");
    Book book6 = new Book(6,"Дом на краю ночи",350,"Кэтрин Бэннер");
    Book book7 = new Book(7,"451",289,"Рэй Брэдбери");
    Book book8 = new Book(8,"Маленький принц",139,"Антуан де Сент-Экзюпери");
    Book book9 = new Book(9,"Гроздья гнева",309,"Джон Стейнбек");
    Smartphone smartphone1 = new Smartphone(10,"Galaxy",15000,"Samsung");
    Smartphone smartphone2 = new Smartphone(11,"Iphone",150000,"Apple");
    Smartphone smartphone3 = new Smartphone(12,"Redmi",15000,"Xiaomi");
    Smartphone smartphone4 = new Smartphone(13,"Honor",15000,"Huawei");


}
