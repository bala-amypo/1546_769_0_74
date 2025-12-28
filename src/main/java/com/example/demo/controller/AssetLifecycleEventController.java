package com.example.demo.controller;

import com.example.demo.entity.AssetLifecycleEvent;
import com.example.demo.service.AssetLifecycleEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lifecycle-events")
public class AssetLifecycleEventController {

    private final AssetLifecycleEventService service;

    public AssetLifecycleEventController(AssetLifecycleEventService service) {
        this.service = service;
    }

    // POST /lifecycle-events/asset/{assetId}
    @PostMapping("/asset/{assetId}")
    public AssetLifecycleEvent logEvent(
            @PathVariable Long assetId,
            @RequestBody AssetLifecycleEvent event) {
        return service.logEvent(assetId, event);
    }

    @GetMapping("/asset/{assetId}")
    public List<AssetLifecycleEvent> getEventsByAsset(@PathVariable Long assetId) {
        return service.getEventsByAsset(assetId);
    }
}
