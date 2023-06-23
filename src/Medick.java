public class Medick extends Hero{
    private int healPoint=10;
    public void increaseExperience(){
        this.healPoint+=0.1;
        System.out.println("Количевсво лечение увеличено на 10%");
    }
    @Override
    public String ablySuperAbility() {
        return "Medick применил петод HEALTH";

    }
}
