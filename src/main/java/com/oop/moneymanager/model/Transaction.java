package com.oop.moneymanager.model;


import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.sql.Date;

@Data
@Table
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "Category_id")
    private Category category;

    @Column
    @NonNull
    private Integer amount;

    @Column
    @NonNull
    private Date time;

    @Column
    private String note;


    public Transaction(Integer numberOfMoney, Date time, String notes) {
        this.amount = numberOfMoney;
        this.time = time;
        this.note = notes;
    }
    public Transaction(){}

    public Integer getType() {
        return this.category.getType();
    }

    public void copy(Transaction transaction){
        this.setNote(transaction.getNote());
        this.setAmount(transaction.getAmount());
        this.setCategory(transaction.getCategory());
        this.setTime(transaction.getTime());
        this.setAccount(transaction.getAccount());
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Transaction transaction){
            return transaction.getId().equals(this.getId());
        }
        return false;
    }

}
