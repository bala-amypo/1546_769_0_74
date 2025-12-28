package com.example.demo.controller;

import com.example.demo.entity.Vendor;
import com.example.demo.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
@CrossOrigin
public class VendorController {

    private final VendorService service;

    public VendorController(VendorService service) {
        this.service = service;
    }

    // POST /vendors
    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return service.saveVendor(vendor);
    }

    // GET /vendors
    @GetMapping
    public List<Vendor> getAllVendors() {
        return service.getAllVendors();
    }
}
