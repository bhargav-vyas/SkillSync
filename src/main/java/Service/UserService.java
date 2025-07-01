package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userrepository;
	
}
