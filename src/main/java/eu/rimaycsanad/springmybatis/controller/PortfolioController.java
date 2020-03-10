package eu.rimaycsanad.springmybatis.controller;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Portfolio;
import eu.rimaycsanad.springmybatis.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portfolio")
public class PortfolioController {

	@Autowired
	private PortfolioService portfolioService;

	@GetMapping
	public List<Portfolio> getPortfolioList() {
		return portfolioService.getPortfolios();
	}

	@PostMapping
	public int createPortfolio(@RequestBody Portfolio portfolio) {
		return portfolioService.createPortfolio(portfolio);
	}

	@RequestMapping("/{id}")
	public Portfolio getPortfolioById(@PathVariable Integer id) {
		return portfolioService.getPortfolioById(id);
	}
}
