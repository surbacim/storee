package com.store.library.service;

import com.store.library.dto.AdminDto;
import com.store.library.model.Admin;
import org.springframework.stereotype.Service;


public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}