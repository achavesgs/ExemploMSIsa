package com.example.ExemploMS.service;

import com.example.ExemploMS.client.ClientService;
import com.example.ExemploMS.client.vo.Token;
import com.example.ExemploMS.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    ClientService client;

    public Pessoa buscaPessoa(int id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setIdade(32);
        return pessoa;
    }

    public Token buscaToken() {
        return client.geraToken();
    }
}
