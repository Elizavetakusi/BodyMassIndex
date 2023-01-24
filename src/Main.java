public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60.0; // килограммы
        double height = 1.71; // метры

        double index = service.calculate(weight, height);

        System.out.println((index) + " индекс массы тела");
    }
}