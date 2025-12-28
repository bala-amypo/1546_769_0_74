package com.example.demo.controller;

import com.example.demo.entity.AssetDisposal;
import com.example.demo.service.AssetDisposalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asset-disposals")
@CrossOrigin
public class AssetDisposalController {

    private final AssetDisposalService service;

    public AssetDisposalController(AssetDisposalService service) {
        this.service = service;
    }

    // POST /api/asset-disposals
    @PostMapping
    public AssetDisposal requestDisposal(@RequestBody AssetDisposal disposal) {
        return service.requestDisposal(disposal);
    }

    // GET /api/asset-disposals
    @GetMapping
    public List<AssetDisposal> getAllDisposals() {
        return service.getAllDisposals();
    }
}
