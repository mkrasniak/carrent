package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Rent;
import com.app.repositories.RentRepository;

@Service
public class RentServiceImpl implements RentService {

	private RentRepository rentRepository;

	@Autowired
	public RentServiceImpl(RentRepository rentRepository) {
		this.rentRepository = rentRepository;
	}

	@Override
	public Rent getRentById(Integer id) {
		return rentRepository.findOne(id);
	}

	@Override
	public Rent saveRent(Rent rent) throws Exception {
		Iterable<Rent> rents = listAllRents();
		Rent localRent = (Rent) rent.clone();
		for (Rent r : rents) {
			if (!(r.getRentStartDate().after(rent.getRentEndDate())
					|| r.getRentEndDate().before((rent.getRentStartDate())))) {

				r.getCars().retainAll(localRent.getCars());
				if (r.getCars().size() != 0) {
					throw new Exception("conflict with rent " + r.getRentId());
				}
			}
		}
		return rentRepository.save(rent);
	}

	@Override
	public void deleteRent(Integer id) {
		rentRepository.delete(id);
	}

	@Override
	public Iterable<Rent> listAllRents() {
		return rentRepository.findAll();
	}

}
