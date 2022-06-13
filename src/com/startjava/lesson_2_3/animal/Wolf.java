package com.startjava.lesson_2_3.animal;

public class Wolf {
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String colour;

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public  int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void wolfWalking() {
        System.out.println("Wolf is walking");
    }
    public void wolfSitting() {
        System.out.println("Wolf is sitting");
    }
    public void wolfRunning() {
        System.out.println("Wolf is running");
    }
    public void wolfHowling() {
        System.out.println("Wolf is howling");
    }
    public void wolfHunting() {
        System.out.println("Wolf is hunting");
    }
}