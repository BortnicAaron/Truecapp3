package com.example.truecapp3.services;
import com.example.truecapp3.repositories.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
@Autowired
  TransactionRepository transactionRepository;
}
