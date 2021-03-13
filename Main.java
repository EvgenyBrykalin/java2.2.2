public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.4;
        double height = 1.82;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
