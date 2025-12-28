package com.example.demo.controller;

import com.example.demo.entity.Asset;
import com.example.demo.service.AssetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {

    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    // POST /assets/vendor/{vendorId}/rule/{ruleId}
    @PostMapping("/vendor/{vendorId}/rule/{ruleId}")
    public Asset createAsset(
            @PathVariable Long vendorId,
            @PathVariable Long ruleId,
            @RequestBody Asset asset) {
        return service.createAsset(vendorId, ruleId, asset);
    }

    @GetMapping
    public List<Asset> getAllAssets() {
        return service.getAllAssets();
    }

    @GetMapping("/{id}")
    public Asset getAsset(@PathVariable Long id) {
        return service.getAsset(id);
    }

    // GET /assets/status/{status}
    @GetMapping("/status/{status}")
    public List<Asset> getByStatus(@PathVariable String status) {
        return service.getAssetsByStatus(status);
    }
}
