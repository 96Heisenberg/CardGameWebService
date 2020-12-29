package com.innovation.service.classes;

import com.innovation.model.Card;
import com.innovation.model.Rank;
import com.innovation.model.Suit;
import com.innovation.service.interfaces.ICardDealingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CardDealingService implements ICardDealingService {

    private static  List<Rank> rankList = Arrays.asList(Rank.values());
    private static  List<Suit> suitList = Arrays.asList(Suit.values());
    private static  List<Card> cardList = new ArrayList<>();

    @Override
    public List<Card> createDeckOfShuffledCard() {

        suitList.forEach(s -> {
            rankList.forEach(r -> {
                cardList.add(new Card(s, r));
            });
        });

        Collections.shuffle(cardList);
        return cardList;
    }
}
