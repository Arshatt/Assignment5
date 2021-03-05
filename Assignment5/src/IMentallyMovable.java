public interface IMentallyMovable {
    void degrade();

    default void growWiser(){
        System.out.println("Study OOP as hard as possible!");
    }

}
