package pro.sky;

public class Human {
    private String name = null;
    private int age = 0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}
