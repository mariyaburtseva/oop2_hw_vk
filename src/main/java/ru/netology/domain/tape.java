package ru.netology.domain;

public class tape {
    private String id; // идентификатор записи
    private Boolean recordCommunity; // записи сообщества
    private Boolean interesting; // сначала интересные
    private String headImage; // изображение сообщества
    private String headTextUrl; // текст, название сообщества
    private String headDateUrl; // дата, время, сколько запись размещена
    private String text; // текст записи
    private String imageURL; // ссылка на изображение
    private String imageLike; //изображение лайка
    private int numberOfLike; // кол-во лайков
    private String imageShare; // изображение поделиться
    private int numberOfShare; //количество поделившихся
    private String views; // просмотров
    private String comments; // комментарии
}
