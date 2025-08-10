package com.desafio.adapters.input;


import com.desafio.domain.TransactionModel;
import com.desafio.usecase.TransactionUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionUseCase transactionUseCase;

    public TransactionController(TransactionUseCase transactionUseCase) {
        this.transactionUseCase = transactionUseCase;

    }
    @PostMapping("/transacao")
    public ResponseEntity<TransactionModel> criarTransacao(@RequestBody TransactionDTO dto) {
        TransactionModel model = TransactionDTO.toModelMapper(dto);

            TransactionModel criado = transactionUseCase.criarTransacao(model);

            return ResponseEntity.status(201).body(criado);
    }
}
