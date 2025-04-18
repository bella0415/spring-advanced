package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Override
    @EntityGraph(attributePaths = {"user"})
    Page<Todo> findAll(Pageable pageable); // findAll + EntityGraph로 대체

    @EntityGraph(attributePaths = {"user"})
    Optional<Todo> findById(Long todoId); // findById + EntityGraph로 대체

    int countById(Long todoId);
}
