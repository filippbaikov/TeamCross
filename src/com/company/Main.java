package com.company;

public class Main {


    public static void main(String[] args) {


        Team[] team = {
                new Human("Зураб", 200, 400),
                new Human("Сосик", 300, 150),
                new Human("Сулико", 400, 600),
                new Cat("Асхаб", 340, 80),
                new Cat("Хасбула", 100, 10),
                new Cat("Абдурозик", 500, 20),
                new Robot("Robocop", 100,200),
                new Robot("t-800", 400,400),
                new Robot("БПЛА mq-1",700,10),
        };
        for (int i = 0; i < team.length; i++) {
            team[i].cross();
            team[i].jump();

        }
    }
}


