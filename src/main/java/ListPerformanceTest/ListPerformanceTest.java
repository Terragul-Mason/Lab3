package ListPerformanceTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования производительности коллекций ArrayList и LinkedList.
 */
public class ListPerformanceTest {
    /**
     * Главный метод, который запускает тестирование для ArrayList и LinkedList.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int operationsCount = 1000;

        System.out.println("ArrayList:");
        testListPerformance(new ArrayList<>(), operationsCount);

        System.out.println("LinkedList:");
        testListPerformance(new LinkedList<>(), operationsCount);
    }

    /**
     * Метод для тестирования производительности коллекций.
     * Он выполняет 3 основные операции (add, get, remove) на коллекции заданное количество раз.
     *
     * @param list коллекция, на которой выполняются операции
     * @param operationsCount количество операций для тестирования
     */
    public static void testListPerformance(List<Integer> list, int operationsCount) {
        long startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++)
            list.add(i);
        long endTime = System.nanoTime();
        System.out.println("add(" + operationsCount + "): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++)
            list.get(i);
        endTime = System.nanoTime();
        System.out.println("get(" + operationsCount + "): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++)
            list.remove(0);
        endTime = System.nanoTime();
        System.out.println("remove(" + operationsCount + "): " + (endTime - startTime) + " ns");
    }
}
