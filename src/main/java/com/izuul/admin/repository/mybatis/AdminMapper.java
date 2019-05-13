package com.izuul.admin.repository.mybatis;

import com.github.pagehelper.Page;
import com.izuul.admin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    Page<SysUser> findSysUsers();
}
