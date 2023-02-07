package com.example.spring.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.spring.entity.SpringEntity;
import com.example.spring.spring.repository.SpringRepository;
import com.example.spring.spring.service.SpringService;
import com.medical.video.controller.AuthenticationController;
import com.medical.video.repository.OneTimePasswordRepository;
import com.medical.video.repository.UserRepository;
import com.medical.video.response.Response;
import com.medical.video.response.ResponseGenerator;
import com.medical.video.response.TransactionContext;
import com.medical.video.security.JwtTokenUtil;
import com.medical.video.service.MessagePropertyService;
import com.medical.video.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
@Api(value = "Authorization Rest API", description = "Defines endpoints that can be hit only when the user is not logged in. It's not secured by default.")
@AllArgsConstructor(onConstructor_ = { @Autowired })
public class SpringController {

	private static final Logger logger = Logger.getLogger(AuthenticationController.class);
	private @NonNull ResponseGenerator responseGenerator;

	private @NonNull UserRepository userRepository;

	private @NonNull UserService userservice;

	
	
	//private @NonNull UserValidator userValidator;
	
	@ApiOperation(value = "Allows to create new user.", response = Response.class)
	@PostMapping(value = "/create", produces = "application/json")
	public ResponseEntity<?> create(@ApiParam(value = "The user request payload") @RequestBody SpringEntity spring,
			@RequestHeader HttpHeaders httpHeader) throws Exception {
		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
		try {			
			SpringService springService = new SpringService();
			//ValidationResult validationResult = userValidator.validate(RequestType.POST, request);
			springService.saveOrUpdate(spring);

			return responseGenerator.successResponse(context, "user.create", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	}
}
		
	
	



