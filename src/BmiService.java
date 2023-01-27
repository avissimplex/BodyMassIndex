public class BmiService {
    public float calculate(int mass, float height) {
        float result = mass / (height * height);

        return result;
    }
}
