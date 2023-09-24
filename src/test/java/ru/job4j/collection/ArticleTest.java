package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * 2.1.6. Map
 * 1. ��������� ������
 * 1.
 * ����� ������� �����. �� ���� �������� ����� � �����������.
 * �� ��� ���������� ����� �����.
 *
 * ����� ���������, ��� ����� ����� ��� ������� �� �������������.
 */
public class ArticleTest {

    @Test
    public void whenLineGnrTrue() {
        assertThat(
                Article.generateBy(
                        "���� ���� ���� � ����",
                        "���� ����"
                ),
                is(true)
        );
    }

    @Test
    public void whenLineGnrFalse() {
        assertThat(
                Article.generateBy(
                        "���� ���� ���� � ����",
                        "���� ���"
                ),
                is(false)
        );
    }

    @Test
    public void whenWordSurplusedThenFalse() {
        assertThat(
                Article.generateBy(
                        "���� ���� ���� � ����",
                        "���� ���� ����"
                ),
                is(false)
        );
    }

    @Test
    public void whenLongTextTrue() {
        assertThat(
                Article.generateBy(
                        "��� ���� ����� ������� ������, " +
                                "����� �� � ����� �������, " +
                                "�� ������� ���� �������� " +
                                "� ����� �������� �� ���. " +
                                "��� ������ ������ �����; " +
                                "��, ���� ���, ����� ����� " +
                                "� ������� ������ � ���� � ����, " +
                                "�� ������ �� ���� �����! " +
                                "����� ������ ��������� " +
                                "���������� ���������, " +
                                "��� ������� ����������, " +
                                "�������� ��������� ���������, " +
                                "�������� � ������ ��� ����: " +
                                "����� �� ���� ������� ����!",
                        "��� ���� ��� ������ ��� ���� � ���� � ����"
                ),
                is(true)
        );
    }
    @Test
    public void whenLongTextFalse() {
        assertThat(
                Article.generateBy(
                        "��� ���� ����� ������� ������, " +
                                "����� �� � ����� �������, " +
                                "�� ������� ���� �������� " +
                                "� ����� �������� �� ���. " +
                                "��� ������ ������ �����; " +
                                "��, ���� ���, ����� ����� " +
                                "� ������� ������ � ���� � ����, " +
                                "�� ������ �� ���� �����! " +
                                "����� ������ ��������� " +
                                "���������� ���������, " +
                                "��� ������� ����������, " +
                                "�������� ��������� ���������, " +
                                "�������� � ������ ��� ����: " +
                                "����� �� ���� ������� ����!",
                        "��� ���� ��� ������ ��� Linux � Java ���� � ����"
                ),
                is(false)
        );
    }
}