package com.vti.departmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vti.departmentservice.entity.Account;
import com.vti.departmentservice.repository.IAccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService{

    private final IAccountRepository acRepository;
    @Override
    public List<Account> getListAccounts() {
        return acRepository.findAll();
    }
    
}
