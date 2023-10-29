public class Main {
    public static void main(String[] args) {

        final int volumeGlassMl = 230;
        System.out.println("Объем стакана - " + volumeGlassMl + " мл");

        final double percentGlassFull = 0.63;
        System.out.println("Стакан заполнен на " + percentGlassFull + " процентов");

        final double glassFullMl = volumeGlassMl * percentGlassFull;
        System.out.println("Стакан заполнен на " + glassFullMl + " мл");
    }
}
