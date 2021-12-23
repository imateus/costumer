package br.com.elizabethcarrilho.repository;

import br.com.elizabethcarrilho.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Long> {}
