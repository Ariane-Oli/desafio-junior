package com.desafio.adapters.input;


import com.desafio.domain.TransactionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionUseCase transactionUseCase{

    @PostMapping("/transacao")
    public ResponseEntity<TransactionModel> criarTransacao(@RequestBody TransactionDTO dto) {


    }
    }
}
