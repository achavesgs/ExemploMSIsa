package com.example.ExemploMS.service;

import com.example.ExemploMS.model.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public Pessoa buscaPessoa(int id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setIdade(32);
        return pessoa;
    }
}
