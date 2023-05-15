package ru.job4j.string;

/**
 * 3. Наибольшее совпадение в строке
 *
 * Метод maxMatch() принимает массив строк strings.
 *
 * Задание: найти максимально длинную последовательность символов, с которой начинаются все элементы массива.
 * Результат нужно вернуть в виде строки, либо вернуть пустую строку, если совпадений нет.
 *
 * Например, при массиве [стол, стул, столица] метод maxMatch() вернёт "ст", а при массиве [дверь, стол] вернется пустая строка "".
 *
 *
 * Примечание: все символы в строках в массиве strings имеют нижний регистр.
 *
 *
 * Рассмотрим варианты решения этой задачи:
 *
 * 1) Самый простой вариант - это горизонтальный поиск последовательностей, т.е. определение и поиск какой-то подстроки в
 * остальных строках массива. Алгоритм такой: Переменная искомой последовательности (rsl) инициализируется первой строкой.
 * Далее в цикле, начиная со следующей строки массива, начинаем искать через indexOf() присутствие rsl в текущей строке.
 * Для этого в цикле while каждый проход уменьшаем rsl на 1 символ, пока rsl не достигнет 0. Если совпадения нет, значит
 * возвращаем пустую строку, так как остальные строки нет смысла проверять, так как уже нет совпадений между двумя первыми строками.
 * Если совпадения есть, то переходим к проверке присутствия полученного rsl в следующей строке и т.д.
 *
 *
 *
 * 2) Следующий вариант - это вертикальный поиск. Данное решение - это ускоренный вариант предыдущего. При вертикальном поиске мы
 * просматриваем все строки массива сначала на совпадение первого символа, потом второго и т.д. Алгоритм такой: открываем цикл и
 * инициализируем первый символ первой строки в переменную типа char. Далее в другом цикле, начиная со следующей строки, проверяем,
 * что либо индекс первого цикла равен длине текущей строки (то есть индекс уже вышел за ее пределы), либо искомый символ не равен
 * текущему символу. В любом из этих случаев возвращается substring() первой строки от 0 до индекса первого цикла.
 *
 *
 *
 * 3) Существуют еще 2 варианта решения - через подход "Разделяй и властвуй" и через бинарный поиск. Суть первого варианта -
 * в делении массива строк на подмассивы, а суть второго - найти длиннейшую последовательность путём бинарного поиска.
 * Если вы хорошо владеете этими алгоритмами, можете попробовать решить с помощью них. Если нет, то решения через второй
 * вариант будет достаточно.
 */
public class Task1 {

    public static String maxMatch(String[] strings) {
        String rsl = "";
        int length = -1;
        boolean status;
        char per = 0;
        /**
         * Определяем длину самой короткой строки
         */
        for (String str : strings) {
            if (length < 0 || str.length() < length) {
                length = str.length();
            }
        }
        for (int j = 0; j < length; j++) {
            status = true;
            if (strings.length == 1) {
                rsl = strings[0];
                break;
            }
            for (int i = 0; i < strings.length - 1; i++) {
                per = strings[i].charAt(j);
                if (strings[i].charAt(j) != strings[i + 1].charAt(j)) {
                    status = false;
                }
            }
            if (!status) {
                break;
            }
            rsl = rsl + per;
        }
        return rsl;
    }
}
