package br.com.elizabethcarrilho.costumer.controller;

import br.com.elizabethcarrilho.costumer.entity.Costumer;
import br.com.elizabethcarrilho.costumer.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostumerController {

    private final CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @PostMapping("/create")
    public Costumer create(@RequestBody Costumer costumer){
        return costumerService.save(costumer);
    }

    @GetMapping("/list")
    public List<Costumer> list(){
        return costumerService.findAll();
    }
}
