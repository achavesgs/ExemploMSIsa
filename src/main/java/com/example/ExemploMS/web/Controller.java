package com.example.ExemploMS.web;

import com.example.ExemploMS.client.vo.Token;
import com.example.ExemploMS.model.Pessoa;
import com.example.ExemploMS.service.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "v1")
public class Controller {

    @Autowired
    private PessoaService pessoaService;

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping(path = "/pessoa/{pessoaId}")
    public ResponseEntity<Pessoa> find() {

        logger.info(pessoaService.buscaPessoa(1).getNome());
        return ResponseEntity.ok(pessoaService.buscaPessoa(1));
    }

    @GetMapping(path = "/token")
    public ResponseEntity<Token> buscaToken(){
        return ResponseEntity.ok(pessoaService.buscaToken());
    }
}
