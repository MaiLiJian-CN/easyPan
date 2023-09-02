package com.easypan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easypan.Mapper.UserInfoMapper;
import com.easypan.domain.UserInfo;
import com.easypan.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
}
