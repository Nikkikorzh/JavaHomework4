
public class Cat implements Comparable<Cat>{
    private String name;
    private String color = "серый";

    private int age = 0;
    private static int catCount = 0;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public Cat(String name,String color) {
        this.name = name;
        this.color = color;
        catCount++;
    }

    public Cat(String name,String color,int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;
    }

    public int getAllCatCount() {
        return catCount;
    }

    @Override
    public String toString() {
        return "Age (" + age + ")";
    }
    @Override
    public int compareTo(Cat o) {
        return this.getAge() - o.getAge();
    }


}