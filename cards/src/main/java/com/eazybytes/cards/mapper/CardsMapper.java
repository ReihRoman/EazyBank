package com.eazybytes.cards.mapper;

import com.eazybytes.cards.dto.CardsDTO;
import com.eazybytes.cards.entity.Cards;

public class CardsMapper {

    public static CardsDTO mapToCardsDto(Cards cards,CardsDTO cardsDTO ){
        cardsDTO.setMobileNumber(cards.getMobileNumber());
        cardsDTO.setCardNumber(cards.getCardNumber());
        cardsDTO.setCardType(cards.getCardType());
        cardsDTO.setTotalLimit(cards.getTotalLimit());
        cardsDTO.setAmountUsed(cards.getAmountUsed());
        cardsDTO.setAvailableAmount(cards.getAvailableAmount());
        return cardsDTO;
    }

    public static Cards mapToCards(CardsDTO cardsDTO,Cards cards){
        cards.setMobileNumber(cardsDTO.getMobileNumber());
        cards.setCardNumber(cardsDTO.getCardNumber());
        cards.setCardType(cardsDTO.getCardType());
        cards.setTotalLimit(cardsDTO.getTotalLimit());
        cards.setAmountUsed(cardsDTO.getAmountUsed());
        cards.setAvailableAmount(cardsDTO.getAvailableAmount());
        return cards;
    }
}
