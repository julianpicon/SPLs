package co.com.itshirt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.itshirt.domain.Usuario;
import co.com.itshirt.repository.UserRepository;

@RestController
public class PruebaRestController {
	
    private UserRepository userRepository;

    public PruebaRestController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<Usuario> getHotels(){
        Iterable<Usuario> hotels = this.userRepository.findAll();

        return hotels;
    }
}
