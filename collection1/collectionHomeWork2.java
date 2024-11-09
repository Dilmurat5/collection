package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collectionHomeWork2 {

    private Map<String, List<String>> phoneBook;

    public collectionHomeWork2() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи имя-телефон
    public void add(String name, String phoneNumber) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }

    // Метод для поиска номеров телефона по имени
    public List<String> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    // Метод для проверки наличия телефона в справочнике
    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> numbers : phoneBook.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}

