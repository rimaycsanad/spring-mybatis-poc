package eu.rimaycsanad.springmybatis.service.impl;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.PortfolioValue;
import eu.rimaycsanad.springmybatis.mapper.PortfolioValueMapper;
import eu.rimaycsanad.springmybatis.service.PortfolioValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioValuesServiceImpl implements PortfolioValueService {

	@Autowired
	private PortfolioValueMapper mapper;

	@Override
	public List<PortfolioValue> getPortfolioValues() {
		return mapper.getPortfolioValues();
	}
}
