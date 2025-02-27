public class Dog {
  private int age;
  private String name;
  private String color;

  // constructors
  public Dog() {
    age = 0;
    name = "";
    color = "";
  }
  public Dog(int age, String name, String color) {
    this.age = age;
    this.name = name;
    this.color = color;
  }

  // methods
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public String getColor() {
    return color;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  private void addOneAge() {
    age++;
  }
  public int birthday() {
    addOneAge();
    return age;
  }
  public String toString() {
    return "The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
  }
}