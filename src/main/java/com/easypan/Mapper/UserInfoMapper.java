package com.easypan.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easypan.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

// spring框架创建mapper接口相对应的接口实现类
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
