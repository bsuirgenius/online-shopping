package com.projectjava.onlineshopping.service;

import com.projectjava.onlineshopping.model.Address;

public interface AddressService {

	boolean saveAddress(Address address);
	Address findAddressByBilling(boolean billing);

}
