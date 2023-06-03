package ru.job4j.comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1.3.4. Сортировка
 * 2.5. Способы сортировки. Сортировка Collection. Сортировка через создание новой коллекции
 *
 * Ранее мы рассмотрели метод list.sort() и Collections.sort(). Рассмотрим как все работает внутри:
 *
 * 1. Происходит преобразование к массиву
 *
 * 2. Этот массив сортируется
 *
 * 3. Производиться проход по массиву и обновляется список, т.е. на старое место элемента встает новый,
 * который должен стоять на его месте по порядку.
 *
 * Это первый недостаток использования данных методов. Второй очевидный недостаток, как нам сортировать,
 * например Set.
 *
 * По возможности, если нам не требуется далее работать с исходной коллекцией и пользоваться ее преимуществами,
 * мы можем делать следующее. Для сортировки сетов мы можем создать новый сет уже отсортированный (в случае
 * если у нас есть неотсортированный сет, например LinkedHashSet, HashSet). Новый сет будет TreeSet, который
 * хранит элементы в упорядоченном порядке.
 *
 * Например:
 *
 * Set<Integer> set = new HashSet(List.of(5, 3, 4, 1, 2)); // порядок произвольный
 *
 * Set<Integer> sorted = new TreeSet(set); // порядок 1, 2, 3, 4, 5
 *
 * Ваша задача получить отсортированный сет по списку строк. Среди элементов нет null.
 */
public class SortBySet {
    public static Set<String> sort(List<String> list) {
        Set<String> rsl = new TreeSet<>(list);
        return rsl;
    }
}
