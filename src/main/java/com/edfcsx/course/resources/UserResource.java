package com.edfcsx.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edfcsx.course.entities.User;
import com.edfcsx.course.services.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> users = userService.findAll();
		
		return ResponseEntity.ok().body(users);
	}

	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = userService.findById(id);

		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<User> create(@RequestBody User obj) {
		obj = userService.create(obj);

		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(obj.getId())
				.toUri();

		return ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		userService.delete(id);

		return ResponseEntity.noContent().build();
	}
}
