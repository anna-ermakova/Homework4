public class Main {
    public static void main(String[] args) {

    //task 1
    System.out.println("ДЗ1. Задание 1");
    int age=50;
    if (age>=18) {System.out.println("Поздравляю, ты совершеннолетний!!!");}
    if (age<18) {System.out.println("До совершеннолетия нужно еще подождать...");}

    //task 2
    System.out.println("ДЗ1. Задание 2");
    int ageOfThePerson=20;
    if (ageOfThePerson>=7) {
    if (ageOfThePerson<18)
        System.out.println("Ребенок ходит в школу");}
    if (ageOfThePerson>=18) {
    if (ageOfThePerson<24)
            System.out.println("Человек уже закончил школу и может отправляться в университет.");}
    if (ageOfThePerson>24) {
    System.out.println("Человек окончил университет и ему пора искать работу.");}

    //task 3
    System.out.println("ДЗ1. Задание 3");
    int numberOfPassengers=1;
    int allWagonPlace=102;
    int sitWagonPlace=60;
    int standWagonPlace=allWagonPlace-sitWagonPlace;
    if (numberOfPassengers>=102){
        System.out.println("Свободных мест нет!");}
    if (numberOfPassengers>=60){
        if (numberOfPassengers<102)
        System.out.println("В вагоне свободно "+(allWagonPlace-numberOfPassengers)+" стоячих мест");}
    if (numberOfPassengers<60){
        System.out.println("В вагоне свободно "+(sitWagonPlace-numberOfPassengers)+" сидячих мест и "+(allWagonPlace-sitWagonPlace)+ " стоячих мест.");
    }



           }
    }