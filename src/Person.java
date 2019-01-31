public class Person {
    protected int age;
    protected String name;
    protected Gender sex;
    protected String department;


    public Person(String name, int age, Gender sex, String department) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getSex() {
        return this.sex;
    }

    public String getDepartment() {
        return this.department;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printPerson() {
        System.out.println("name: " + this.name + "\n" + "age: " + this.age + "\n" + "sex: " + this.sex + "\n" + "department: " + this.department + "\n");
    }

}