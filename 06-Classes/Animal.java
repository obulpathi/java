public class Animal {
    String name;
    int age;
    char sex;

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name
    }

    public void setName(String name){
        this.name = name
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
