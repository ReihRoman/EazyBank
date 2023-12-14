package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    boolean updateAccount(CustomerDto customerDto);

    CustomerDto fetchAccount (String mobileNumber);

    void createAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}

