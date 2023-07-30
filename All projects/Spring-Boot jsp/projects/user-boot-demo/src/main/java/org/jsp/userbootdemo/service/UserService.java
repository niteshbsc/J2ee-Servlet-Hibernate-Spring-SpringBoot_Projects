package org.jsp.userbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootdemo.dao.UserDao;
import org.jsp.userbootdemo.dto.User;
import org.jsp.userbootdemo.exception.IdNotFoundException;
import org.jsp.userbootdemo.exception.InvalidCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public ResponseEntity<ResponseStructure<User>>  saveUser(User user) {
		ResponseStructure<User> structure= new ResponseStructure<User>();
		structure.setMessage("User Registered succesfully");
		structure.setBody(dao.saveUser(user));
		structure.setCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<User>>  updateUser(User user) {
		ResponseStructure<User> structure= new ResponseStructure<User>();
		structure.setMessage("User Update succesfully");
		structure.setBody(dao.updateUser(user));
		structure.setCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.ACCEPTED);
	}
	public ResponseEntity<ResponseStructure<User>> findUser(int id) {
		ResponseStructure<User> structure= new ResponseStructure<User>();
		Optional<User> recUser= dao.findUser(id);
		if(recUser.isPresent()) {
			structure.setBody(recUser.get());
			structure.setMessage("User Found");
			structure.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
		}
		throw new IdNotFoundException();
		
//		structure.setBody(null);
//		structure.setMessage("User Not Found");
//		structure.setCode(HttpStatus.NOT_FOUND.value());
//		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<List<User>>> finAll() {
		ResponseStructure<List<User>> structure= new ResponseStructure <List<User>>();
			structure.setBody(dao.findAll());
			structure.setMessage("All the Users are Displayed");
			structure.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<User>>>(structure, HttpStatus.OK);
		}
	public ResponseEntity<ResponseStructure<String>> deleteUser(int id) {
		ResponseStructure<String> structure= new ResponseStructure<String>();
		Optional<User> recUser= dao.findUser(id);
		if(recUser.isPresent()) {
			dao.deleteUser(id);
			structure.setBody("User Deleted");
			structure.setMessage("User Found");
			structure.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.OK);
		}
		
		structure.setBody("user not deleted");
		structure.setMessage("User Not Found");
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<User>> verifyUser(long phone, String password){
		ResponseStructure<User> structure=new ResponseStructure<>();
		Optional<User> recUser=dao.verifyUser(phone, password);
		if(recUser.isPresent()) {
			structure.setBody(recUser.get());
			structure.setMessage("User Verified Succesfully");
			structure.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
		}
		throw new InvalidCredentialsException();
		
//		Not need we handle exception
//		structure.setBody(null);
//		structure.setMessage("Invalid phone number and password");
//		structure.setCode(HttpStatus.NOT_FOUND.value());
//		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<User>> verifyUser(String email, String password){
		ResponseStructure<User> structure=new ResponseStructure<>();
		Optional<User> recUser=dao.verifyUser(email, password);
		if(recUser.isPresent()) {
			structure.setBody(recUser.get());
			structure.setMessage("User Verified Succesfully");
			structure.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
		}
		structure.setBody(null);
		structure.setMessage("Invalid phone number and password");
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.NOT_FOUND);
	}
}
//	@Autowired
//	private UserDao dao;
//	
//	public User saveUser(User user) {
//		return dao.saveUser(user);
//	}
//	public User updateUser(User user) {
//		return dao.updateUser(user);
//	}
//	public User findUser(int id) {
//		Optional<User> recUser= dao.findUser(id);
//		if(recUser.isPresent())
//			return recUser.get();
//		return null;
//	}
//	public List<User> findAll(){
//		return dao.findAll();
//	}
//	
//	public String deleteUser(int id) {
//		Optional<User> recUser=dao.findUser(id);
//		if(recUser.isPresent()) {
//			dao.deleteUser(id);
//			return "user deleted";
//		}
//		return "cannot delete User";
//		}
	

