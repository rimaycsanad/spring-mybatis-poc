package eu.rimaycsanad.springmybatis.mapper;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Portfolio;
import org.apache.ibatis.annotations.Param;

public interface PortfolioMapper {

	List<Portfolio> getPortfolios();
	int createPortfolio(Portfolio portfolio);
	Portfolio getPortfolioById(@Param("id") Integer id);
}
