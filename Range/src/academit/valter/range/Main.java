package academit.valter.range;

public class Main {
    public static void main(String[] args) {
        Range cut1 = new Range(2, 5);
        Range cut2 = new Range(3, 7);
        Range cut3 = new Range(6, 8);
        Range cut4 = new Range(7, 12);
        Range cut5 = new Range(5, 9);
        Range cut6 = new Range(2, 12);
        Range cut7 = new Range(2, 9);

//        System.out.println(cut1.length());
//        System.out.println(cut1.isInside(3));
//        System.out.println("Пересечение интервалов.");
//        cut1.crossing(cut2).print();

  /*      cut1.crossing(cut2).toString();
        Range[] cut10 = cut1.union(cut3);
        System.out.println("Объединение интервалов. Результат 2 интеравала:");
        for (Range range : cut10) {
            range.print();
        }

        Range[] cut11 = cut1.union(cut2);
        System.out.println("Объединение интервалов. Результат 1 интеравал:");
        for (Range range: cut11){
            range.print();
        }*/

    /*    Range[] cut12 = cut4.difference(cut5);
        System.out.println("Разница интервалов" );
        for (Range range : cut12) {
            range.print();
        }*/
    }
}