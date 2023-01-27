public class BmiService {
    public float calculate(int mass, float height) {
        float result = mass / (height * height);
        if (result > 25) {
            System.out.println("ты жирная");

        } else {
            System.out.println("ты тощая");
        }
        return result;

    }
}
