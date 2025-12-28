package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.AssetLifecycleEventService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AssetLifecycleEventServiceImpl implements AssetLifecycleEventService {

    private final AssetRepository assetRepo;
    private final AssetLifecycleEventRepository eventRepo;

    public AssetLifecycleEventServiceImpl(AssetRepository assetRepo,
                                          AssetLifecycleEventRepository eventRepo) {
        this.assetRepo = assetRepo;
        this.eventRepo = eventRepo;
    }

    @Override
    public AssetLifecycleEvent logEvent(Long assetId, AssetLifecycleEvent event) {
        Asset asset = assetRepo.findById(assetId)
                .orElseThrow(() -> new RuntimeException("Asset not found"));

        event.setAsset(asset);
        return eventRepo.save(event);
    }

    @Override
    public List<AssetLifecycleEvent> getEventsByAsset(Long assetId) {
        return eventRepo.findByAssetId(assetId);
    }
}
