package com.simplepicpay.controllers;

import com.simplepicpay.domain.transaction.Transaction;
import com.simplepicpay.dtos.TransactionDTO;
import com.simplepicpay.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
        Transaction newTRansaction = this.transactionService.createTransaction(transaction);
        return new ResponseEntity<>(newTRansaction, HttpStatus.CREATED);
    }
}
