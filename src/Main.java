public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int result = service.calculate(70, 180);
        System.out.println("Индекс массы тела равен: " + result);
    }
}


