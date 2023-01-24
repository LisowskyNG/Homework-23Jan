public class Main {
    public static void main(String[] args) {
        // task 1 - 3
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // task 4 - 5
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        // task 6
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = (weightSecondBoxer + weightFirstBoxer);
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг.");
        var differenceWeight = (weightSecondBoxer - weightFirstBoxer);
        System.out.println("Разница в массе бойцов " + differenceWeight + " кг.");
        System.out.println(" ");

        //task 7
        System.out.println("Задача 7");
        var differenceWeight2 = (weightSecondBoxer % weightFirstBoxer);
        System.out.println("Разница в массе бойцов " + differenceWeight + " кг. (Первый способ)");
        System.out.println("Разница в массе бойцов " + differenceWeight2 + " кг. (Второй способ)");
        System.out.println(" ");

        //task 8
            // Part 1
        System.out.println("Задача 8 Часть 1");
        var totalHours = 640;
        var workDay = 8;
        var totalEmpl = (totalHours / workDay);
        System.out.println("Всего работников в компании - " + totalEmpl + " человек");
        System.out.println(" ");
            //Part 2
        System.out.println("Задача 8 Часть 2");
        var totalEmplPart2 = (totalEmpl + 94);
        var totalHoursPart2 = (totalEmplPart2 * workDay);

        System.out.println("Если в компании работает " + totalEmplPart2 + " человек, то всего "
                + totalHoursPart2 + " часов работы может быть поделено между сотрудниками.");


    }
}
