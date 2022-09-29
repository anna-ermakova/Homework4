public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Задание 3. Задача 1");

        int peopleAge = 10;
        boolean canGoToKindergarten = (peopleAge >= 2 && peopleAge <= 6);
        boolean canGoToSchool = (peopleAge >= 7 && peopleAge < 18);
        boolean canGoToUniversity = (peopleAge >= 18 && peopleAge < 24);
        boolean canGoToWork = (peopleAge >= 24);
        if (canGoToWork) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить на работу.");
        } else if (canGoToUniversity) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в университет.");
        }else if (canGoToSchool) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в школу.");
        }else if (canGoToKindergarten){
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в детский сад.");
        }

        //task2
        System.out.println("Задание 3. Задача 2");

        int kidAge =10;
        boolean canRideAlone=(kidAge>=14);
        boolean canRideWithMan=(kidAge>=5 && kidAge<14);
        boolean canNotRide=(kidAge<5);
        if (canRideAlone) {
            System.out.println("Ты достаточно взрослый и можешь кататься один.");
        } else if (canRideWithMan) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого.");
        }else if (canNotRide){
            System.out.println("Ты слишком мал и не можешь кататься.");
        }

        //task3
        System.out.println("Задание 3. Задача 3");

        int one=12;
        int two=512;
        int free=7;
        if (one>two && one>free) {
            System.out.println(one + " - наибольшее число.");
        }else if (two>one&&two>free) {
            System.out.println(two + " - наибольшее число.");
        }else if (free>one&&free>two){
            System.out.println(free+ " - наибольшее число.");
        }
    }
}