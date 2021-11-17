package ru.NewHomework;

public class HomeworkSix {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        Dog dogVasya = new Dog("Vasya");
        Dog dogMartin = new Dog("Martin");
        Dog dogHort = new Dog("Hort");

        Cat catBarsik = new Cat("Barsik");
        Cat catKuzya = new Cat("Kuzya");
        Cat catMatilda = new Cat("Matilda");
        Cat catShila = new Cat("Shila");

        dogBobik.doRun(150);
        dogBobik.doSwim(11);

        dogHort.doRun(357);
        dogHort.doSwim(8);

        dogMartin.doRun(555);
        dogMartin.doSwim(5);

        dogVasya.doRun(300);
        dogVasya.doSwim(13);

        catBarsik.doRun(128);
        catBarsik.doSwim(1);

        catMatilda.doRun(321);
        catMatilda.doSwim(0);

        catKuzya.doRun(57);
        catKuzya.doSwim(0);

        catShila.doRun(412);
        catShila.doSwim(1);

    }

   // public int count()
}
