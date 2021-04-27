package com.labcnt.smarttirtayasa;

public class Question {
    public String nQuestion[] = {
            "nama pelanet pertama didalam solar system",
            "nama pelanet kedua didalam solar system",
            "nama pelanet ketiga didalam solar system",
            "nama pelanet keempat didalam solar system"

    };

    private String nChoice[][] = {
            {"Mercurius", "Venus", "Bumi", "Mars"},
            {"Mercurius", "Venus", "Bumi", "Mars"},
            {"Mercurius", "Venus", "Bumi", "Mars"},
            {"Mercurius", "Venus", "Bumi", "Mars"}
    };

    private String nCorrectAnswer[] = {"Merkurius", "Venus", "Bumi", "Mars"};

    public String getQuestion(int a){
        String question = nQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = nChoice[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = nChoice[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = nChoice[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = nChoice[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = nCorrectAnswer[a];
        return answer;
    }
}

