package com.user.example.application.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.example.application.dto.UserDTO;
import com.user.example.application.entity.User;
import com.user.example.application.repository.UserRepository;
import java.util.List;
import org.modelmapper.ModelMapper;

@Service
public class UserService {
	 @Autowired
	    private UserRepository  userRepository;

	    private ModelMapper modelMapper = new ModelMapper();

//	    public UserDTO convertUserDAOToDTO(Optional<UserDAO> userDAO){
//	        return modelMapper.map(userDAO, UserDTO.class);
//	    }

	    public User convertUserDTOToEntity(UserDTO userDTO){
	        return modelMapper.map(userDTO, User.class);
	    }
	    
	    public ArrayList<UserDTO> getAllUsers(){
	        List<User> users =  userRepository.findAll();
	        ArrayList<UserDTO> userDTOS = new ArrayList<UserDTO>();
	        for (User user: users) {
	           // userDTOS.add(this.convertUserDAOToDTO(Optional.ofNullable(userDAo)));
	            userDTOS.add(modelMapper.map(user, UserDTO.class));

	        }
	        return userDTOS;
	    }

	    public UserDTO getUserByID(Integer user_id){
	        Optional<User> userDAO = userRepository.findById(user_id);
	        //return this.convertUserDAOToDTO(userDAO);
	        return modelMapper.map(userDAO.get(), UserDTO.class);
	    }

	    public UserDTO createUser(UserDTO userDTO){
	        User user = this.convertUserDTOToEntity(userDTO);
	        user = userRepository.save(user);
	       // return this.convertUserDAOToDTO(Optional.of(userDAO));
	        return modelMapper.map(user, UserDTO.class);
	    }

	    public UserDTO updateUser(Integer user_id, UserDTO userDTO){
	        User user = this.convertUserDTOToEntity(userDTO);
	        user.setId(user_id);
	        user = userRepository.save(user);
	       // return this.convertUserDAOToDTO(Optional.of(userDAO));
	        return modelMapper.map(user, UserDTO.class);
	    }

	    public void deleteUser(Integer user_id){
	        userRepository.deleteById(user_id);
	    }
	}





		