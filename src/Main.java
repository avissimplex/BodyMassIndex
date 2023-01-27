public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int mass = 73;
        float height = 1.72F;
        float index = service.calculate(mass, height);
        
        System.out.println(index);
    }
}