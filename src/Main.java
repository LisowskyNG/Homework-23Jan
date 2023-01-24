public class Main {
    public static void main(String[] args) {
        // task 1 - 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4 - 5
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // task 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = (weightSecondBoxer + weightFirstBoxer);
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг.");
        var differenceWeight = (weightSecondBoxer - weightFirstBoxer);
        System.out.println("Разница в массе бойцов " + differenceWeight + " кг.");

        //task 7
        var differenceWeight1 = differenceWeight;
        var differenceWeight2 = (weightSecondBoxer % weightFirstBoxer);
        System.out.println("Разница в массе бойцов " + differenceWeight1 + " кг. (Первый способ)");
        System.out.println("Разница в массе бойцов " + differenceWeight2 + " кг. (Второй способ)");




    }
}
