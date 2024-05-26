package com.BloodDonation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BloodDonation.repository.DonorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public void saveDonor(Donor donor) {
        donorRepository.save(donor);
    }

    public Donor getDonorById(Long id) {
        Optional<Donor> optionalDonor = donorRepository.findById(id);
        return optionalDonor.orElse(null);
    }

    public void updateDonor(Long id, Donor updatedDonor) {
        Optional<Donor> optionalDonor = donorRepository.findById(id);
        optionalDonor.ifPresent(donor -> {
            donor.setName(updatedDonor.getName());
            donor.setPhone(updatedDonor.getPhone());
            donor.setBloodGroup(updatedDonor.getBloodGroup());
            donor.setSocialMedia(updatedDonor.getSocialMedia());
            donor.setLastDonation(updatedDonor.getLastDonation());
            donorRepository.save(donor);
        });
    }

    public void deleteDonor(Long id) {
        donorRepository.deleteById(id);
    }
}
