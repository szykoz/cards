package com.skoziol.cards.mapper;

import com.skoziol.cards.dto.CardsDto;
import com.skoziol.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDto(Cards cards) {
        return new CardsDto(
                cards.getMobileNumber(),
                cards.getCardNumber(),
                cards.getCardType(),
                cards.getTotalLimit(),
                cards.getAmountUsed(),
                cards.getAvailableAmount()
        );
    }
    public static Cards mapToCards(Cards cards, CardsDto cardsDto) {
        cards.setMobileNumber(cardsDto.mobileNumber());
        cards.setCardNumber(cardsDto.cardNumber());
        cards.setCardType(cardsDto.cardType());
        cards.setTotalLimit(cardsDto.totalLimit());
        cards.setAmountUsed(cardsDto.amountUsed());
        cards.setAvailableAmount(cardsDto.availableAmount());
        return cards;
    }
}
