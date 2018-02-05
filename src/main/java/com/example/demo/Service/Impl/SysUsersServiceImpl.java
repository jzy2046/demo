package com.example.demo.Service.Impl;

import com.example.demo.Service.SysUsersService;
import com.example.demo.entity.SysUsers;
import com.example.demo.entity.SysUsersExample;
import com.example.demo.dao.SysUsersMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SysUsersServiceImpl implements SysUsersService{
    @Resource
    private SysUsersMapper sysUsersMapper;
    @Override
    public SysUsers selectByPrimaryKey(Long id) {
        SysUsersExample sysUsersExample=new SysUsersExample();
        SysUsersExample.Criteria criteria = sysUsersExample.createCriteria();
        criteria.andLoginIdEqualTo("001");
        List<SysUsers> sysUsers = sysUsersMapper.selectByExample(sysUsersExample);
        return sysUsers.get(0);
    }
}
