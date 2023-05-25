package main.java.org.example.data;

import java.io.Serializable;

import static main.java.org.example.data.Country.RU;

public class MaestroCard extends Card implements ICard, Serializable {

    public MaestroCard() {
        super(PaymentSystem.MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
