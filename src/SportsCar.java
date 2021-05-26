public class SportsCar extends Car{
    public int gearRation = 9;
    public String accelarate (){
        return "Accelarate : SportsCar";
    }

    public static void main(String[] args) {
        Car c = new SportsCar();
        System.out.println(c.gearRatio + " " + c.accelerate());
    }
}
