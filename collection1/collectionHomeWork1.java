package collection1;

import java.util.ArrayList;
import java.util.List;

public class collectionHomeWork1 {

    // Метод для создания списка значений в диапазоне min-max
    public static ArrayList<Integer> createRangeList(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Метод для суммирования элементов списка, значение которых больше 5
    public static int sumGreaterThanFive(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    // Метод для переписи каждой заполненной ячейки списка указанным числом
    public static void fillListWithNumber(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    // Метод для увеличения каждого элемента списка на указанное число
    public static void incrementListByNumber(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    // Класс Сотрудник
    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Метод для получения списка имен сотрудников
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    // Метод для получения списка сотрудников старше указанного возраста
    public static List<Employee> getEmployeesByMinAge(List<Employee> employees, int minAge) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                result.add(employee);
            }
        }
        return result;
    }

    // Метод для проверки, превышает ли средний возраст сотрудников указанный
    public static boolean isAverageAgeGreaterThan(List<Employee> employees, int minAvgAge) {
        if (employees.isEmpty()) return false;

        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        return (totalAge / employees.size()) > minAvgAge;
    }

    // Метод для получения самого молодого сотрудника
    public static Employee getYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) return null;

        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
}

