package org.generation.blogpessal.repository;

import org.generation.blogpessal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{

}
