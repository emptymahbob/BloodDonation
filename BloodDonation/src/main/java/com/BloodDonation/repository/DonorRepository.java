package com.BloodDonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BloodDonation.service.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {

}