package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * 2.1.6. Map
 * 1. Генератор текста
 * 1.
 * Задан большой текст. Из него вырезают слова и предложения.
 * Из них составляют новый текст.
 *
 * Нужно проверить, что новый текст был получен из оригинального.
 */
public class ArticleTest {

    @Test
    public void whenLineGnrTrue() {
        assertThat(
                Article.generateBy(
                        "Мама мыла раму и окно",
                        "мыла окно"
                ),
                is(true)
        );
    }

    @Test
    public void whenLineGnrFalse() {
        assertThat(
                Article.generateBy(
                        "Мама мыла раму и окно",
                        "мыла пол"
                ),
                is(false)
        );
    }

    @Test
    public void whenWordSurplusedThenFalse() {
        assertThat(
                Article.generateBy(
                        "Мама мыла раму и окно",
                        "Мама мыла мыла"
                ),
                is(false)
        );
    }

    @Test
    public void whenLongTextTrue() {
        assertThat(
                Article.generateBy(
                        "Мой дядя самых честных правил, "
                                + "Когда не в шутку занемог, "
                                + "Он уважать себя заставил "
                                + "И лучше выдумать не мог. "
                                + "Его пример другим наука; "
                                + "Но, боже мой, какая скука "
                                + "С больным сидеть и день и ночь, "
                                + "Не отходя ни шагу прочь! "
                                + "Какое низкое коварство "
                                + "Полуживого забавлять, "
                                + "Ему подушки поправлять, "
                                + "Печально подносить лекарство, "
                                + "Вздыхать и думать про себя: "
                                + "Когда же черт возьмет тебя!",
                        "Мой дядя мог думать про тебя и день и ночь"
                ),
                is(true)
        );
    }

    @Test
    public void whenLongTextFalse() {
        assertThat(
                Article.generateBy(
                        "Мой дядя самых честных правил, "
                                + "Когда не в шутку занемог, "
                                + "Он уважать себя заставил "
                                + "И лучше выдумать не мог. "
                                + "Его пример другим наука; "
                                + "Но, боже мой, какая скука "
                                + "С больным сидеть и день и ночь, "
                                + "Не отходя ни шагу прочь! "
                                + "Какое низкое коварство "
                                + "Полуживого забавлять, "
                                + "Ему подушки поправлять, "
                                + "Печально подносить лекарство, "
                                + "Вздыхать и думать про себя: "
                                + "Когда же черт возьмет тебя!",
                        "Мой дядя мог думать про Linux и Java день и ночь"
                ),
                is(false)
        );
    }

    public void whenAfterWordDotTrue() {
        assertThat(
                Article.generateBy(
                        "Мама",
                        "мыла."
                ),
                is(true)
        );
    }

    public void whenAfterWordCommaTrue() {
        assertThat(
                Article.generateBy(
                        "Мама",
                        "мыла,"
                ),
                is(true)
        );
    }
}