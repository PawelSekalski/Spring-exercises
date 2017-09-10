package app.niereaktor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.niereaktor.model.Posts;

@Repository
public interface PostsRepo extends JpaRepository<Posts,Long>{
	
	
	
}
