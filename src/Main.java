public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 100;
        double h = 1.8;
        double myBmi = service.calculate(m, h);
        System.out.println("body mass index:");
        System.out.println(myBmi);
    }

}