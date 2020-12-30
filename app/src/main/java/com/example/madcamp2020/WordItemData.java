package com.example.madcamp2020;

import java.util.ArrayList;

public class WordItemData {
    public String word;
    public String meaning;

    // 화면에 표시될 문자열 초기화
    public WordItemData(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    // 입력받은 숫자의 리스트생성
    public static ArrayList<WordItemData> createContactsList(int numContacts) {
        ArrayList<WordItemData> contacts = new ArrayList<WordItemData>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new WordItemData("Person ", "test"+i));
        }

        return contacts;
    }

}
