package com.bookstorespring.bookstore.repository;

import com.bookstorespring.bookstore.domain.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
}
