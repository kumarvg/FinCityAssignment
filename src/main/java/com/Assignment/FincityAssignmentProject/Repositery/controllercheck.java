/*
 * package com.example.restapplication.controller;
 * 
 * import com.example.restapplication.bean.User; import
 * com.example.restapplication.respository.UserRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import java.sql.SQLIntegrityConstraintViolationException; import
 * java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/user") public class UserController {
 * 
 * @Autowired UserRepository userRepository;
 * 
 * @GetMapping("/test") public String test() { String testing = "testing";
 * return testing; }
 * 
 * @GetMapping public List<User> getAllUsers() { return
 * userRepository.getUser(); }
 * 
 * 
 * @PostMapping public ResponseEntity<String> createUser(@RequestBody User user)
 * throws SQLIntegrityConstraintViolationException { if
 * (userRepository.findById(user.getId()) != null) { return new
 * ResponseEntity<String>("Duplicate Entry " + user.getId(),
 * HttpStatus.IM_USED); } userRepository.saveUser(user); return
 * ResponseEntity.status(HttpStatus.CREATED).build(); }
 * 
 * 
 * 
 * 
 * 
 * }
 */