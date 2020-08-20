package com.xxx.service.impl;

import com.xxx.service.IOrgService;
import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl implements IOrgService {
    @Override
    public void addOrg() {
        System.out.println("OrgServiceImpl.addOrg");
    }
}
