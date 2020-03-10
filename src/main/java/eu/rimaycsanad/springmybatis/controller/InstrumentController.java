package eu.rimaycsanad.springmybatis.controller;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Instrument;
import eu.rimaycsanad.springmybatis.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("instrument")
public class InstrumentController {

	@Autowired
	private InstrumentService service;

	@GetMapping
	public List<Instrument> getInstruments() {
		return service.getInstruments();
	}
}
