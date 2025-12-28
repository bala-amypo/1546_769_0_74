package com.example.demo.service;

import com.example.demo.entity.DepreciationRule;
import java.util.List;

public interface DepreciationRuleService {

    DepreciationRule saveRule(DepreciationRule rule);

    List<DepreciationRule> getAllRules();
}
