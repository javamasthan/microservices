package com.crud.service;

import java.util.Optional;

import com.crud.entity.Mobile;

public interface MobileService {
	
	public Mobile saveMobile(Mobile mob);

	public  Optional<Mobile> getMobileById(long id);

	public Mobile updateMobile(Mobile mob);

}
