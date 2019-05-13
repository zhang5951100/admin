package com.izuul.admin.service;

import com.github.pagehelper.Page;
import com.izuul.admin.entity.SysUser;
import com.izuul.admin.repository.SysRoleRepository;
import com.izuul.admin.repository.SysUserRepository;
import com.izuul.admin.repository.mybatis.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Page<SysUser> findAllSysUsers() {
        Page<SysUser> sysUsers = adminMapper.findSysUsers();
        return sysUsers;
    }
}
