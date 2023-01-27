public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int mass = 73;
        float height = 1.72F;
        float index = service.calculate(mass, height);
        System.out.println("масса=73 вес=1,27");
        System.out.println(index);

        System.out.println();

        int mass1 = 100;
        float height1 = 1.50F;
        float index1 = service.calculate(mass1, height1);
        System.out.println("масса=100 вес=1,50");
        System.out.println(index1);
    }
}