package com.example.demo.service.impl;

import com.example.demo.entity.AssetDisposal;
import com.example.demo.repository.AssetDisposalRepository;
import com.example.demo.service.AssetDisposalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetDisposalServiceImpl implements AssetDisposalService {

    private final AssetDisposalRepository repository;

    public AssetDisposalServiceImpl(AssetDisposalRepository repository) {
        this.repository = repository;
    }

    @Override
    public AssetDisposal requestDisposal(AssetDisposal disposal) {
        disposal.setStatus("REQUESTED");
        return repository.save(disposal);
    }

    @Override
    public List<AssetDisposal> getAllDisposals() {
        return repository.findAll();
    }
}
