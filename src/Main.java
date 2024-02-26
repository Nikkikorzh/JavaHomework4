import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Вадя", new Cat("Васёк","Черный"));
        catMap.put("Вадим", new Cat("Вадим", "Белый", 12));
        catMap.put("Гриша", new Cat("Гриша"));
        catMap.put("Веня", new Cat("Веня", "Черный"));
        catMap.put("Сергей", new Cat("Сергей", "Серо-белый", 4));
        catMap.put("Рыжик", new Cat("Рыжик", "Рыжий", 5));
        catMap.put("Мишка", new Cat("Мишка", "Тёмно-серый"));
        catMap.put("Матросик", new Cat("Матросик", "Черный в полосочку", 2));
        catMap.put("Максимка", new Cat("Максимка"));
        catMap.put("Джон", new Cat("Джон"));

        System.out.print("Количество созданных котов : ");

        for (Cat cat : catMap.values()) {
            System.out.println(cat.getAllCatCount());
            break;
        }

        List<Map.Entry<String, Cat>> list = new LinkedList<>(catMap.entrySet());
        Map<String, Cat> sortedCatMapAge = new LinkedHashMap<String, Cat>();

        Collections.sort(list, new Comparator<Map.Entry<String, Cat>>() {
            @Override
            public int compare(Map.Entry<String, Cat> o1, Map.Entry<String, Cat> o2) {
                return (o1.getValue()).getName().compareTo(o2.getValue().getName());
            }
        }); // сортировка по алфавиту

        Map<String, Cat> sortedCatMapName = new LinkedHashMap<String, Cat>();
        for (Map.Entry<String, Cat> entry : list) {
            sortedCatMapName.put(entry.getKey(), entry.getValue());
        }
        Collections.sort(list, new Comparator<Map.Entry<String, Cat>>() {
            @Override
            public int compare(Map.Entry<String, Cat> o1, Map.Entry<String, Cat> o2) {
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        }); //сортировка по возрасту
        for (Map.Entry<String, Cat> entry : list) {
            sortedCatMapAge.put(entry.getKey(), entry.getValue());
        }


        System.out.println("Отсортированный список по алфавиту : ");
        System.out.println(sortedCatMapName);

        System.out.println("Отсортированный список по возрасту : ");
        System.out.println(sortedCatMapAge);
    }
}