package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Entity.UserEntity;

import Repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	public UserEntity resisterUser(UserEntity user) {
		return userrepository.save(user);
	}
	
}