public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte banana = 4;
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        short cucumber = 30000;
        System.out.println("Значение переменной cucumber с типом short равно " + cucumber);
        int apple = 20000000;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        long orange = 90000000000000000L;
        System.out.println("Значение переменной Orange с типом long равно " + orange);
        float tomatoes = 1.1f;
        System.out.println("Значение переменной Tomatoes с типом floats равно " + tomatoes);
        double pepper = 1.1234567899;
        System.out.println("Значение переменной Pepper с типом double равно " + pepper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float apple =  27.12f;
        System.out.println(apple);
        long orange = 987678965549L;
        System.out.println(orange);
        float cucumber = 2.786f;
        System.out.println(cucumber);
        short tomatoes = 569;
        System.out.println(tomatoes);
        short pepper = - 159;
        System.out.println(pepper);
        short banana = 27897;
        System.out.println(banana);
        byte candy = 67;
        System.out.println (candy);
    }

    private static void task3() {
        System.out.println("Задача 3");
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        byte commonStudents = (byte) (lpStudents + asStudents + eaStudents);
        short paperCommon = 480;
        byte paperIndividual = (byte) (paperCommon/commonStudents);
        System.out.println("На каждого ученика рассчитано " + paperIndividual + " листов бумаги");
    }
    private static void task4() {
        System.out.println("Задача 4");
        byte quantityOfBottles = 16;
        byte timeOfWork = 2;
        byte timeOfWork2 = 20;
        int QuantityOfBottles2 = (int) quantityOfBottles * timeOfWork2/ timeOfWork;
        System.out.println("За 20 минут машина произвела " + QuantityOfBottles2 + " штук бутылок");
        short timeOfWork3 = 1440;
        int QuantityOfBottles3 = (int) quantityOfBottles * timeOfWork3/ timeOfWork;
        System.out.println("За 1 сутки машина произвела " + QuantityOfBottles3 + " штук бутылок");
        int timeOfWork4 = timeOfWork3 * 3;
        int QuantityOfBottles4 = (int) quantityOfBottles * timeOfWork4/ timeOfWork;
        System.out.println("За 3 дня машина произвела " + QuantityOfBottles4 + " штук бутылок");
        int timeOfWork5 = timeOfWork3 * 31;
        int quantityOfBottles5 = (int) quantityOfBottles * timeOfWork5/ timeOfWork;
        System.out.println("За 1 месяц машина произвела " + quantityOfBottles5 + " штук бутылок");
    }
    private static void task5() {
        System.out.println("Задача 5");
        byte jarCommon = 120;
        byte jarWhiteForClass =2;
        byte jarBrownForClass = 4;
        byte jarForClass = (byte) (jarBrownForClass + jarWhiteForClass);
        byte quantityOfClasses = (byte) (jarCommon / jarForClass);
        byte quantityOfJarWhite = (byte) (jarWhiteForClass * quantityOfClasses);
        byte quantityOfJarBrow = (byte) (jarBrownForClass * quantityOfClasses);
        System.out.println("В школе, где " + quantityOfClasses + " классов, нужно " + quantityOfJarWhite + " банок белой краски и " + quantityOfJarBrow + " банок коричневой краски.");
    }
    private static void task6() {
        System.out.println("Задача 6");
        byte bananas =5;
        byte weightBanana1 = 80;
        short weightBananas = (short) (bananas * weightBanana1);
        byte milk = 2;
        byte weightMilk100Ml = 105;
        short weightMilk = (short) (weightMilk100Ml * milk);
        byte iceCream =2;
        byte weightIceCream1 = 100;
        short weightIceCream = (short) (iceCream * weightIceCream1);
        byte eggs = 4;
        byte weight1Egg = 70;
        short weightEggs = (short) (eggs * weight1Egg);
        short weightCommon = (short) (weightBananas + weightMilk + weightIceCream + weightEggs);
        System.out.println("Вес завтрака составляет " + weightCommon + " грамм.");
        short kgGramm = 1000;
        float weightCommon2 = ( (float) weightCommon / kgGramm);
        System.out.println("Вес завтрака составляет " + weightCommon2 + " кг.");
    }
    private static void task7() {
        System.out.println("Задача 7");
        byte weightLossKg = 7;
        short weightLossG = (short) (weightLossKg * 1000);
        short weightLoss1 = 250;
        byte daysWeightLoss1 = (byte) (weightLossG / weightLoss1);
        System.out.println("За " + daysWeightLoss1 + " дней спортсмен похудеет на 7 кг, если будет сбрасывать " + weightLoss1 + " г в день");
        short weightLoss2 = 500;
        byte daysWeightLoss2 = (byte) (weightLossG / weightLoss2);
        System.out.println("За " + daysWeightLoss2 + " дней спортсмен похудеет на 7 кг, если будет сбрасывать " + weightLoss2 + " г в день");
        byte daysWeightLossAverage = (byte) ((daysWeightLoss1 + daysWeightLoss2) / 2);
        System.out.println("В среднем, за " + daysWeightLossAverage + " день спортсмен похудеет на 7 кг, если будет сбрасывать от 250 до 500 г в день");
    }
    private static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int salaryNewMasha = (int) ( (float) masha / 100 * 10) + masha;
        int salaryForYearOld1 = masha *12;
        int salaryForYearNew1 = (int) (salaryNewMasha *12);
        int salaryDiffenceMasha = salaryForYearNew1 - salaryForYearOld1;
        System.out.println("Маша теперь получает " + salaryNewMasha + " рублей в месяц, что увеличивает ее годовой доход на " + salaryDiffenceMasha + " рублей.");
        int salaryNewDenis = (int) ( (float) denis / 100 * 10) + denis;
        int salaryForYearOld2 = denis *12;
        int salaryForYearNew2 = salaryNewDenis *12;
        int salaryDiffenceDenis = salaryForYearNew2 - salaryForYearOld2;
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей в месяц, что увеличивает его годовой доход на " + salaryDiffenceDenis + " рублей.");
        int salaryNewKristina = (int) ( (float) kristina / 100 * 10) + kristina;
        int salaryForYearOld3 = kristina *12;
        int salaryForYearNew3 = salaryNewKristina *12;
        int salaryDiffenceKristina = salaryForYearNew3 - salaryForYearOld3;
        System.out.println("Кристина теперь получает " + salaryNewKristina + " рублей в месяц, что увеличивает ее годовой доход на " + salaryDiffenceKristina + " рублей.");
    }
}






