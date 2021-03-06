package com.depromeet.dodo.pet.service;

import org.springframework.stereotype.Service;

import com.depromeet.dodo.pet.domain.Pet;
import com.depromeet.dodo.pet.repository.PetRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PetService {

	private final PetRepository petRepository;

	public void addPet(Pet pet) {
		petRepository.save(pet);
	}
}
