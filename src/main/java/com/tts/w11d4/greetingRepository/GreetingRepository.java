package com.tts.w11d4.greetingRepository;

import org.springframework.data.repository.CrudRepository;

import com.tts.w11d4.model.W11d4;


public interface GreetingRepository extends CrudRepository<W11d4, Long>
 {

}
