package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity,Integer>{
	

}
