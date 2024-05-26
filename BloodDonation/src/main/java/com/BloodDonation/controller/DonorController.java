package com.BloodDonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.BloodDonation.service.Donor;
import com.BloodDonation.service.DonorService;

@Controller
public class DonorController {

    @Autowired
    private DonorService donorService;

    @GetMapping("/donors")
    public String showDonors(Model model) {
        model.addAttribute("donors", donorService.getAllDonors());
        return "donorList";
    }

    @GetMapping("/addDonor")
    public String showAddDonorForm(Model model) {
        model.addAttribute("donor", new Donor());
        return "addDonor";
    }

    @PostMapping("/donors")
    public String addDonor(@ModelAttribute Donor donor) {
        donorService.saveDonor(donor);
        return "redirect:/donors";
    }

    @GetMapping("/editDonor/{id}")
    public String showEditDonorForm(@PathVariable Long id, Model model) {
        Donor donor = donorService.getDonorById(id);
        model.addAttribute("donor", donor);
        return "editDonor";
    }

    @PostMapping("/editDonor/{id}")
    public String updateDonor(@PathVariable Long id, @ModelAttribute Donor donor) {
        donorService.updateDonor(id, donor);
        return "redirect:/donors";
    }

    @GetMapping("/deleteDonor/{id}")
    public String deleteDonor(@PathVariable Long id) {
        donorService.deleteDonor(id);
        return "redirect:/donors";
    }
}
