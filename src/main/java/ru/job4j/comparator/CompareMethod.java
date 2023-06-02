package ru.job4j.comparator;

/**
 * 1.3.4. Сортировка
 * 1.0. Получение компаратора. Метод compare()
 *
 * Базовым методом компаратора является метод Comparator.compare(). Он принимает два объекта, которые нужно
 * сравнить. Этот метод, как и метод compareTo() у интерфейса Comparable, возвращает число типа int.
 * Почему именно число? Что его значение значит?
 *
 * Возвращается именно число, потому что с помощью него можно легко представить три состояния: "меньше",
 * "больше", "равно", соответственно, для отрицательного, положительного чисел, а также 0.
 *
 * По числу мы можем определить порядок элементов. Именно порядок. Порядок важен, потому что компараторы
 * используются при сортировках, в которых важно знать, какой порядок мы хотим получить.
 *
 * Рассмотрим метод Integer.compare(число1, число2)
 *
 * - если результат отрицательный => число1 идет раньше чем число2. Например, Integer.compare(1, 2) = -1.
 *
 * - если результат равен 0 => что порядок не важен. Например, Integer.compare(1, 1) = 0
 *
 * - если результат положительный => число1 идет после числа2. Например, Integer.compare(2, 1) = 1
 *
 * Ваша задача написать два метода, которые сравнивают два числа, первый сравнивает в прямом порядке,
 * второй в обратном порядке. Т.е. первый должен быть аналогичен Integer.compare(), а второй должен
 * возвращать обратный ему результат.
 */
public class CompareMethod {

    public static int ascendingCompare(int first, int second) {
        return Integer.compare(first, second);
    }

    public static int descendingCompare(int first, int second) {
        return Integer.compare(second, first);
    }

}