public class Main {
    public static void main(String[] args) {
// Задание 1
System.out.println(" Задание 1");

        byte Easy = 3;
        System.out.println("Значение переменной " +  "Easy" + " с типом " + "byte" + " равно "  + Easy );
        short notVeryHard = 5;
        System.out.println("Значение переменной " +  "not Very Hard" + " с типом " + "short" + " равно "  + notVeryHard );
        int average = 243;
        System.out.println("Значение переменной " +  "average" + " с типом " + "int" + " равно "  + average );
        long hard = 1567L;
        System.out.println("Значение переменной " +  "hard" + " с типом " + "long" + " равно "  + hard );
        float sevenSigns = 2.1f;
        System.out.println("Значение переменной " +  "seven Signs" + " с типом " + "float" + " равно "  + sevenSigns );
        double manySigns = 3.45345664;
        System.out.println("Значение переменной " +  "many Signs" + " с типом " + "double" + " равно "  + manySigns );



// Задание 2
        System.out.println(" Задание 2");

        float meat = 27.12f;
        System.out.println(meat);
        long paper = 987678965549L;
        System.out.println(paper);
        double metrs = 2.786;
        System.out.println(metrs);
        boolean room = metrs > 3;
        System.out.println(room);
        int sweet = 569;
        System.out.println(sweet);
        short temperature = -169;
        short ground = 27897;
        System.out.println(ground);
        byte orange = 67;
        System.out.println(orange);
        char mix = 245;
        System.out.println(mix);


// Задание 3
            System.out.println("Задание3");

            byte teacherlydmila = 23;
            byte teacerAnna = 27;
            byte teacherEkaterina = 30;
            short totalPaper = 480;
            int forEveryoneStudent = totalPaper / (teacherlydmila + teacerAnna + teacherEkaterina);
            System.out.println("На каждого ученика рассчитано " + forEveryoneStudent + " листов бумаги");

// Задание 4
        System.out.println("Задание 4");

        byte in2Minutes = 16;
        int in1Minute = in2Minutes / 2;
        int in20Minutes = in1Minute * 20;
        System.out.println("За  20 минут машины произвела бутылок " + in20Minutes + " штук");
        int in1Day = in1Minute * 24 * 60;
        System.out.println("За  сутки машины произвела бутылок " + in1Day + " штук");
        int in3Days = in1Day * 3;
        System.out.println("За  3 дня машины произвела бутылок " + in3Days + " штук");
        int in1Month = in1Day * 31;
        System.out.println("За  1 месяц машины произвела бутылок " + in1Month + " штук");

// Задание 5
        System.out.println("Задание 5");

        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classrooms = paint / (whitePaint + brownPaint);
        int totalWhitePaint = whitePaint * classrooms;
        int totalBrownPaint = brownPaint * classrooms;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");


// Задание 6
        System.out.println("Задание 6");


        short bananas = 5 * 80;
        short milk = 2 * 105;
        short icecream = 2 * 100;
        short eggs = 4 * 70;
        int breakfast = bananas + milk + icecream + eggs;
        int kilogram = breakfast / 1000;
        System.out.println("Вес такого завтрака составляет " + kilogram + " кг");

// Задание 7
            System.out.println( "Задание 7");


            byte lostWeightBy = 7;
            float if250Gram = lostWeightBy / 0.25f;
            float if500Gram = lostWeightBy / 0.5f;
            double onAverage =  (if500Gram + if250Gram) / lostWeightBy;
            System.out.println("Если за " + if250Gram + " дней спортсмен похудеет на 7 кг при похудении за день на 250 грамм,  а за " + if500Gram + " при условии похудения на 500 грамм, то в среднем он похудеет за " + onAverage );


// Задание 8
            System.out.println("Задание 8");


            int wagesByMasha = 67760;
            int wagesByDenis = 83690;
            int wagesByKristina = 76230;
            double MashaIn10More = wagesByMasha * 0.10 + wagesByMasha;
            double DenisIn10More = wagesByDenis * 0.10 + wagesByDenis;
            double KristinaIn10More = wagesByKristina * 0.10 + wagesByKristina;
            int annualIncomeMasha = wagesByMasha * 12;
            double annualIncomeMasha10 = MashaIn10More * 12;
            int annualIncomeDenis = wagesByDenis * 12;
            double annualIncomeDenis10 = DenisIn10More * 12;
            int annualIncomeKristina = wagesByKristina * 12;
            double annualIncomeKristina10 = KristinaIn10More * 12;
            double differenceMasha = annualIncomeMasha10 - annualIncomeMasha;
            double differenceDenis = annualIncomeDenis10 - annualIncomeDenis;
            double differenceKristina = annualIncomeKristina10 - annualIncomeKristina;
            System.out.println("Маша теперь получает " + MashaIn10More + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
            System.out.println(" Денис  теперь получает " + DenisIn10More + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
            System.out.println(" Кристина  теперь получает " + KristinaIn10More + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");






            }



    }
