package br.com.elizabethcarrilho.costumer.service;

import br.com.elizabethcarrilho.costumer.entity.Costumer;
import br.com.elizabethcarrilho.costumer.entity.Error;
import br.com.elizabethcarrilho.costumer.repository.CostumerRepository;
import br.com.elizabethcarrilho.costumer.utils.Constant;
import br.com.elizabethcarrilho.costumer.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if(!validate(costumer)) return costumer;
        costumer.setId(sequenceGeneratorService.generateSequence(Costumer.SEQUENCE_NAME));
        return costumerRepository.save(costumer);
    }

    public boolean validate(Costumer costumer){
        if(StringUtils.isEmpty(costumer.getCnpj())){
            costumer.setError(new Error(Constant.ERROR_ID, Constant.ERROR_MSG_INVALID_CNPJ, null));
        }
        return true;
    }

    public List<Costumer> findAll(){
        return costumerRepository.findAll();
    }
}
