package com.skoziol.cards.enums;

public enum CardsEnum {

    STATUS_200("200"),
    STATUS_201("201"),
    STATUS_417("417"),
    MESSAGE_200("Request processed successfully"),
    MESSAGE_201("Card created successfully"),
    MESSAGE_417_UPDATE("Update operation failed. Please try again or contact Dev team"),
    MESSAGE_417_DELETE("Delete operation failed. Please try again or contact Dev team");

    public final String label;

    CardsEnum(String label) {
        this.label = label;
    }
}
