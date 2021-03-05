public class Student implements IMentallyMovable{
    private double GPA;
    private int ID;
    private int hourOfSleep;

    public Student() {
    }

    public Student(double GPA, int ID, int hourOfSleep) {
        this.GPA = GPA;
        this.ID = ID;
        this.hourOfSleep = hourOfSleep;
    }

    public void study(){
        this.hourOfSleep --;
    }

    public String checkMood(){
        if (GPA >= 3.5 && GPA <= 4.0) return "You are a king!";
        if (GPA < 3.5 && GPA >= 3.0) return "Still very good!";
        if (GPA < 3.0 && GPA >= 2.0) return "Pretty okay";
        return "Hmmmm, have to change something in my life...";

    }

    @Override
    public void degrade() {
        System.out.println("PLaying computer games...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", ID=" + ID +
                ", hourOfSleep=" + hourOfSleep +
                '}';
    }
}
