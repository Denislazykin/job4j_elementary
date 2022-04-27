package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        /*
        Тест на проверку rubleToEuro
         */
        float inRubToEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inRubToEuro);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        /*
        Тест на проверку rubleToDollar
         */
        float inRubToDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inRubToDollar);
        boolean passed1 = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed1);
    }
}
