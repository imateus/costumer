package br.com.elizabethcarrilho.controller;

import br.com.elizabethcarrilho.entity.Costumer;
import br.com.elizabethcarrilho.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/costumer")
public class CostumerController {

    private final CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @PostMapping
    public Costumer create(@RequestBody @Valid Costumer costumer){
        return costumerService.save(costumer);
    }
}
