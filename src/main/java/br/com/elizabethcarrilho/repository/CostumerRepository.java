package br.com.elizabethcarrilho.repository;

import br.com.elizabethcarrilho.entity.Costumer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends MongoRepository<Costumer, Long> {}
