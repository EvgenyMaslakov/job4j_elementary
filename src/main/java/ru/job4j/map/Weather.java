package ru.job4j.map;

import java.awt.*;
import java.security.Key;
import java.util.*;
import java.util.List;

/**
 * 1.3.3. Map. HashMap. LinkedHashMap
 *
 * 13. Данные об осадках
 *
 * Метод принимает список объектов Info. При этом эти объекты содержат два поля:
 *
 * 1. city - название города, где производились наблюдения;
 *
 * 2. rainfall - количество осадков, которые выпали в этом городе за период наблюдения.
 *
 * Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info,
 * в котором будет указано название города наблюдения и общее количество осадков за период наблюдения.
 *
 * В качестве промежуточного хранилища используйте LinkedHashMap (города должны находиться в списке
 * в порядке их добавления).
 */
public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> inf = new LinkedHashMap<>();
        for (Info info : list) {
            inf.putIfAbsent(info.getCity(), 0);
            inf.computeIfPresent(info.getCity(), (key, value) -> value + info.getRainfall());
        }
        for (String key : inf.keySet()) {
            rsl.add(new Info(key, inf.get(key)));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
