package com.company;

public class Robot implements Team {
    private String name;
    private int distance;

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setJump_length(int jump_length) {
        this.jump_length = jump_length;
    }

    public Robot(String name, int distance, int jump_length) {
        this.name = name;
        this.distance = distance;
        this.jump_length = jump_length;
    }

    private int jump_length;

    @Override
    public void cross() {
        if (distance>=cross_distance){
            System.out.println("робот ["+name+ "]: пробежал");
        }
        else
            System.out.println("робот [" +name+ "]: я ленивый, я столько не бегаю");
    }

    @Override
    public void jump() {
        if (jump_length>=wall_size)
            System.out.println("робот [" +name+ "]: перепрыгнул");
        else
            System.out.println("робот [" +name+ "]: да пошел ты, я не могу так прыгать");
    }
}
