package eu.rimaycsanad.springmybatis.service.impl;

import java.util.List;

import eu.rimaycsanad.springmybatis.domain.Instrument;
import eu.rimaycsanad.springmybatis.mapper.InstrumentMapper;
import eu.rimaycsanad.springmybatis.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstrumentServiceImpl implements InstrumentService {

	@Autowired
	private InstrumentMapper mapper;

	@Override
	public List<Instrument> getInstruments() {
		return mapper.getInstruments();
	}
}
