package ru.job4j.stream;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 1.4.2. Stream API
 * 7.0. Optional и Stream. Метод stream()
 *
 * В классе Optional есть методы, которые помогают работать со стримами. Например, метод stream(),
 * если значение существует, то этот метод создает стрим из этого значения, если нет, то возвращает пустой стрим.
 *
 * Ваша задача найти тел. номера пользователя с заданным id, которые начинаются с region.
 */
public class OptionalStream {

    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
       /* return users.stream().filter(user -> user.getId() == id)
                .map(user -> user.getNumbers())
                .findFirst()
                .stream()
                .flatMap(phoneNumbers -> phoneNumbers.stream())
                .filter(n -> n.getPhone().startsWith(region))
                .collect(Collectors.toList());*/

       /* return users.stream().filter(user -> user.getId() == id)
                .flatMap(user -> user.getNumbers().stream())
                .filter(n -> n.getPhone().startsWith(region))
                .collect(Collectors.toList());*/

              /*  return users.stream().filter(user -> user.getId() == id)
                .map(user -> user.getNumbers())
                .flatMap(phoneNumbers -> phoneNumbers.stream())
                .filter(n -> n.getPhone().startsWith(region))
                .collect(Collectors.toList());*/

                return users.stream().filter(user -> user.getId() == id)
                .flatMap(user -> user.getNumbers().stream())
                .filter(n -> n.getPhone().startsWith(region))
                .collect(Collectors.toList());
    }

}
