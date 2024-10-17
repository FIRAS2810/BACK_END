package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repos.RegimeRepository;
import com.example.demo.entities.Regime;

@RestController
@RequestMapping("/api/reg")
@CrossOrigin("*")

public class RegimeRESTController {

	@Autowired
	RegimeRepository regimeRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Regime> getAllRegimes()
	{
	return regimeRepository.findAll();
	}
	
	@RequestMapping(path="/addreg" ,method = RequestMethod.POST)
	public Regime createReg(@RequestBody Regime regime) {
	return regimeRepository.save(regime);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Regime getRegimeById(@PathVariable("id") Long id) {
	return regimeRepository.findById(id).get();
	}
	
}