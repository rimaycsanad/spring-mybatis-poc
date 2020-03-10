package eu.rimaycsanad.springmybatis.service.impl;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Portfolio;
import eu.rimaycsanad.springmybatis.mapper.PortfolioMapper;
import eu.rimaycsanad.springmybatis.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioMapper mapper;

	@Override
	public List<Portfolio> getPortfolios() {
		return mapper.getPortfolios();
	}

	@Override
	public int createPortfolio(Portfolio portfolio) {
		return mapper.createPortfolio(portfolio);
	}

	@Override
	public Portfolio getPortfolioById(Integer id) {
		return mapper.getPortfolioById(id);
	}
}
