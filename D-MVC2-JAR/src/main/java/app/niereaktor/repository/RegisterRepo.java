package app.niereaktor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.niereaktor.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register,Long>{
	
	List <Register> findAllByLoginAndPass(String login, String pass);
	
}
