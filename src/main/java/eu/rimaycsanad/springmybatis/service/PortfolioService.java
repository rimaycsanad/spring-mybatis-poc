package eu.rimaycsanad.springmybatis.service;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Portfolio;

public interface PortfolioService {

	List<Portfolio> getPortfolios();
	int createPortfolio(Portfolio portfolio);
	Portfolio getPortfolioById(Integer id);
}
