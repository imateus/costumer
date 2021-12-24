package br.com.elizabethcarrilho.costumer.service;

import br.com.elizabethcarrilho.costumer.entity.Costumer;
import br.com.elizabethcarrilho.costumer.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService {

    private final CostumerRepository costumerRepository;

    @Autowired
    public CostumerService(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }

    public Costumer save(Costumer costumer){
        return costumerRepository.save(costumer);
    }
}
