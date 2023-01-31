public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.70f;
        int weight = 48;
        float index = service.calculate(height, weight);
        System.out.println(index);
    }
}