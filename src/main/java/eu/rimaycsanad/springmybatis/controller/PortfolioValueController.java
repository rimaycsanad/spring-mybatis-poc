package eu.rimaycsanad.springmybatis.controller;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.PortfolioValue;
import eu.rimaycsanad.springmybatis.service.PortfolioValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portfoliovalue")
public class PortfolioValueController {

	@Autowired
	private PortfolioValueService service;

	@GetMapping
	public List<PortfolioValue> getPortfolioValues() {
		return service.getPortfolioValues();
	}
}
