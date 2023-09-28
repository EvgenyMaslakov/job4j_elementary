package ru.job4j.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 2.1.6. Map
 * 5. Супер работник
 *
 * Менеджер компании просить написать утилиту, которая будет показывать
 * список сотрудников на которых назначено больше одной задачи.
 *
 * Задан список задач, где поле assign - это ID сотрудник.
 *
 * Необходимо написать метод, который вернет список сотрудников на которых
 * назначено больше одной задачи.
 */
public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        List<Integer> rsl = new LinkedList<>();
        Map<Integer, Integer> tasksMap = new HashMap<>();
        for (Task task : tasks) {
            tasksMap.merge(task.assignId(), task.taskId(), (prev, curr) -> prev + curr);
        }
        for (int assign : tasksMap.keySet()) {
            if (tasksMap.get(assign) > 1) {
                rsl.add(assign);
            }
        }
        return rsl;
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
