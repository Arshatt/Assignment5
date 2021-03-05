import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {

        //TASK 1
        IMentallyMovable iMentallyMovable = new IMentallyMovable() {
            @Override
            public void degrade() {
                System.out.println("Spending a lot of time in social media");
            }
        };
        iMentallyMovable.growWiser();
        iMentallyMovable.degrade();

        //END OF TASK 1

        //TASK 2

        final Worker worker = Worker.class.getConstructor(int.class, double.class, String.class).newInstance(21, 150000, "Arshat");
        Field workerAge = Worker.class.getDeclaredField("age");
        Field workerSalary = Worker.class.getDeclaredField("salary");
        Field workerName = Worker.class.getDeclaredField("name");
        System.out.println(workerAge + " " + workerName + " " + workerSalary);
        System.out.println(worker);
        System.out.println();

        final Student student = Student.class.getConstructor(double.class, int.class, int.class).newInstance(2.88, 18, 6);
        Field studentGPA = Student.class.getDeclaredField("GPA");
        Field studentID = Student.class.getDeclaredField("ID");
        Field studentHoursOfSleep = Student.class.getDeclaredField("hourOfSleep");
        System.out.println(studentID + " " + studentGPA + " " + studentHoursOfSleep);
        System.out.println(student);

        //END OF TASK 2



    }

}
