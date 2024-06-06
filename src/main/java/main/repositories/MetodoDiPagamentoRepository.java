package main.repositories;

import main.entities.MetodoDiPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoDiPagamentoRepository extends JpaRepository<MetodoDiPagamento,Integer> {}
