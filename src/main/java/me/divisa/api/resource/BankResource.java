package me.divisa.api.resource;

import me.divisa.api.model.Bank;
import me.divisa.api.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankResource {

    @Autowired
    BankRepository bankRepository;

    @GetMapping("/all")
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }



}
