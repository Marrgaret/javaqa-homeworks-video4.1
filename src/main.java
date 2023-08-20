public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 9_690;
        int miles = service.calculate(price); // должно получиться 484
        System.out.println(miles);
    }
}
