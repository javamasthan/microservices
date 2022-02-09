package com.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Mobile;
import com.crud.repo.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public Mobile saveMobile(Mobile mob) {
		return mobileRepository.save(mob);
	}

	@Override
	public Optional<Mobile> getMobileById(long id) {
		
		return mobileRepository.findById(id);
	}

	@Override
	public Mobile updateMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return mobileRepository.save(mob);
	}

}
