package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	Optional<Tarefa> findByStatusTarefa(String statusTarefa);
}