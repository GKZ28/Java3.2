public class BmiService {
    public int calculate(double height, int weight) {
        int calculate = (int) (weight / (height * height));
        return calculate;
    }
}
