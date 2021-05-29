package com.company;

public interface Team {
    int wall_size=100;
    void jump();

    int cross_distance=200;
    void cross();
}
// если jump и cross втрепать одним методом, то можно сделать закономерность наверное:
//если не пробежал, значит не дошел до стены и не прыгнул
