package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Objects;

/**
 * 1.3.4. Сортировка
 * 1.5. Получение компаратора. Метод thenComparing()
 *
 * Иногда бывает так , что необходимо задать приоритет порядка следования элементов. Например, сначала
 * нам нужно отсортировать элементы по одному признаку, но если признаки равны, то сортировать по другому
 * признаку. Для этой задачи существует метод thenComparing().
 *
 * Синтаксис этого метода:
 *
 * СКОМБИНИРОВАННЫЙ_КОМПАРАТОР имя_переменной = ПЕРВЫЙ_КОМПАРАТОР.thenComparing(ВТОРОЙ_КОМПАРАТОР);
 *
 * Полученный таким образом компаратор учитывает оба компаратора, используя сначала первый, а потом второй.
 *
 * Запомните, что второй компаратор отработает только если первый вернул 0.
 *
 * Ваша задача написать компаратор, который будет упорядочивать пользователей сначала по возрастанию по имени,
 * а потом по убыванию по возрасту.
 */
public class ThenComparingMethod {

    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        return comparator;
    }

    public static Comparator<User> descByAge() {
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
        return comparator;
    }

}
