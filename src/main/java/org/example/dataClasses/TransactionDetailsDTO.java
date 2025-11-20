package org.example.dataClasses;

import java.time.LocalDateTime;

public class TransactionDetailsDTO {
    private double amount;
    private String type;
    private boolean byCard;
    private String date;        // nyní String místo LocalDateTime
    private String accountNumber;
    private String ownerName;

    public TransactionDetailsDTO(TransactionDetails details) {
        this.amount = details.getAmount();
        this.type = details.getType();
        this.byCard = details.isByCard();
        this.date = details.getDate().toString();
        this.accountNumber = details.getAccount().getAccountNumber();
        this.ownerName = details.getAccount().getOwner().getFirstName() + " " +
                details.getAccount().getOwner().getLastName();
    }
}

