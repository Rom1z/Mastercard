package main.java.org.example;

import main.java.org.example.data.Card;
import main.java.org.example.data.UnionPayCard;

import java.util.ArrayList;
import java.util.List;

import static main.java.org.example.data.Country.RU;

public class Main {
    public static void main(String[] args) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();


    }
    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println(card.getBalance());
    }

}