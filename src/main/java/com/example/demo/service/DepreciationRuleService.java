package com.example.demo.service.Impl;

import com.example.demo.entity.DepreciationRule;
import com.example.demo.repository.DepreciationRuleRepository;
import com.example.demo.service.DepreciationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepreciationRuleServiceImpl implements DepreciationRuleService {

    private final DepreciationRuleRepository repository;

    public DepreciationRuleServiceImpl(DepreciationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public DepreciationRule saveRule(DepreciationRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<DepreciationRule> getAllRules() {
        return repository.findAll();
    }
}
