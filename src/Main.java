import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        //С помощью условного оператора напишите программу, которая выводит в консоль:
        //сообщение о том, что человеку 18 или больше лет;
        //сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
        //При выполнении каждого условия программа должна выводить в консоль сообщение в
        // формате: «Если возраст человека равен …, то (вывести в зависимости от результата)
        // он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».
        int agePerson1 = 17;
        int agePerson2 = 19;
        boolean ageDoesNotMatch = agePerson1 < 18;
        boolean ageMatch = agePerson2 >= 18;
        if (ageMatch) {
            System.out.println("Если возраст человека равен " + agePerson2 + " то он совершеннолетний");
        }
        if (ageDoesNotMatch) {
            System.out.println("Если возраст человека равен " + agePerson1 + " он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }

        System.out.println("Задача №2");
        //Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
        //«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        //«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        //При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от
        // результата) нужно надеть шапку / можно идти без шапки».
        int temperatureLine = 5;
        int temperatureOutside1 = 18;
        int temperatureOutside2 = -5;
        if (temperatureOutside1 > temperatureLine) {
            System.out.println("На улице " + temperatureOutside1 + " градусов, можно идти без шапки");
        }
        if (temperatureOutside2 < temperatureLine) {
            System.out.println("На улице " + temperatureOutside2 + " градусов, нужно одеть шапку");
        }

        System.out.println("Задача №3");
        //За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что:
        //скорость превышена, если она больше 60 км/ч;
        // превышения скорости нет, если она меньше 60 км/ч.
        //При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …, то (
        // вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».
        int speed1 = 40;
        int speed2 = 70;
        int speedLine = 60;
        boolean speedLevelLow = speed1 < speedLine;
        boolean speedLevelHigh = speed2 > speedLine;
        if (speedLevelLow) {
            System.out.println("Если скорость " + speed1 + " км/ч то, можно ездить спокойно");
        }
        if (speedLevelHigh) {
            System.out.println("Если скорость " + speed2 + " км/ч то, придётся заплатить штраф");
        }

        System.out.println("Задача №4");
        //Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:
        // Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        // Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
        // Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
        // А если человеку больше 24, то ему пора ходить на работу.
        //При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если возраст
        // человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».
        int ageStudent = 4;
        if (ageStudent > 2 && ageStudent < 6) {
            System.out.println("Если возраст человека равен " + ageStudent + ", то ему нужно ходить в детский сад");
        }
        ageStudent = 14;
        if (ageStudent > 7 && ageStudent < 17) {
            System.out.println("Если возраст человека равен " + ageStudent + ", то ему нужно ходить в школу");
        }
        ageStudent = 24;
        if (ageStudent >= 18 && ageStudent <= 24) {
            System.out.println("Если возраст человека равен " + ageStudent + ", то его место в университете");
        }
        ageStudent = 34;
        if (ageStudent > 24) {
            System.out.println("Если возраст человека равен " + ageStudent + ", то ему пора ходить на работу");
        }

        System.out.println("Задача №5");
        //Как правило, на аттракционах действуют ограничения для детей по возрасту:
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        // Если взрослого нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …,
        // то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься
        // на аттракционе в сопровождении / без сопровождения взрослого)».
        int ageChild1 = 3;
        int ageChild2 = 7;
        int ageChild3 = 17;
        boolean noParents = false;
        boolean ageLimit1 = ageChild1 < 5;
        boolean ageLimit2 = (ageChild2 > 5 || ageChild2 < 14);
        boolean ageLimit3 = ageChild3 >= 14;
        if (ageLimit1) {
            System.out.println("Если возраст ребенка равен " + ageChild1 +
                    ", то он не может кататься на атракционе");
        }
        if (ageLimit2) {
            System.out.println("Если возраст ребенка равен " + ageChild2 +
                    ", то он может кататься на атракционе в сопровождении взрослого");
        }
        if (!noParents) {
            System.out.println("Если взрослого нет, то кататься нельзя");
        }
        if (ageLimit3) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", " +
                    "то он может кататься на атракционе без сопровождения взрослого");
        }

        System.out.println("Задача №6");
        //Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        //С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение
        //о том, есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.
        int trainCarriage = 102;
        int seatSitTrainCarriage = 60;
        int ticketCalc;
        int ticket = 40;
        if (ticket < seatSitTrainCarriage) {
            ticketCalc = seatSitTrainCarriage - ticket;
            System.out.println("Если билетов продано: " + ticket +
                    ", то вагоне осталось " + ticketCalc + " сидячих мест");
        }
        ticket = 71;
        if ((ticket > seatSitTrainCarriage) && (ticket <= trainCarriage)) {
            ticketCalc = trainCarriage - ticket;
            System.out.println("Если билетов продано: " + ticket +
                    ", то в вагоне не осталось сидячих мест, но осталось " + ticketCalc + " стоячих мест");
        }
        ticket = 105;
        if ((ticket > seatSitTrainCarriage) && (ticket <= trainCarriage)) {
            ticketCalc = trainCarriage - ticket;
            System.out.println("Если билетов продано: " + ticket +
                    ", то в вагоне не осталось сидячих мест, но осталось " + ticketCalc + " стоячих мест");
        } else {
            System.out.println("Билетов не может быть продано больше чем " + trainCarriage + ". Вагон полностью забит");
        }

        System.out.println("Задача №7");
        //Даны три числа:
        //int one;
        //int two;
        //int three;
        //С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бо́льшее, и выводит результат в консоль.
        int one = 1;
        int two = 5;
        int three = 9;
        boolean resultOne = (one > two) && (one > three);
        boolean resultTwo = (two > one) && (two > three);
        boolean resultThree = (three > one) && (three > two);

        if (resultOne || resultTwo) {
            if (resultOne) {
                System.out.println("Число " + one + " больше, чем " + two + " и " + three);
            } else {
                System.out.println("Число " + two + " больше, чем " + one + " и " + three);
            }
        }
        else {
            System.out.println("Число " + three + " больше, чем " + one + " и " +two);
        }
    }
}