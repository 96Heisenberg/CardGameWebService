package com.innovation.controller;

import com.innovation.model.Card;
import com.innovation.service.classes.CardDealingService;
import com.innovation.service.interfaces.ICardDealingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardDealingController {

    @Autowired
    private ICardDealingService service;

    @GetMapping(value = "/deck")
    @ResponseBody
    public List<Card> getTotalShuffledDeck()
    {
        List<Card> deck = service.createDeckOfShuffledCard();
        return deck;
    }

}
