package br.com.elizabethcarrilho.costumer.service;

import br.com.elizabethcarrilho.costumer.entity.Costumer;
import br.com.elizabethcarrilho.costumer.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService {

    private final CostumerRepository costumerRepository;
    private final SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    public CostumerService(CostumerRepository costumerRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.costumerRepository = costumerRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    public Costumer save(Costumer costumer){
        costumer.setId(sequenceGeneratorService.generateSequence(Costumer.SEQUENCE_NAME));
        return costumerRepository.save(costumer);
    }
}
