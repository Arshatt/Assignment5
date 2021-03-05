public class Worker implements IMentallyMovable {
    private int age;
    private double salary;
    private String name;

    public Worker() {
    }

    public Worker(int age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public void getOld(){
        age++;
    }

    public void rise(){
        salary += (salary * 0.1);
    }


    @Override
    public void degrade() {
        System.out.println("Just making unuseful stuff in front of boss");
        salary -= 1000;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
