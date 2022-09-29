public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Задание 3. Задача1");

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
    }
}