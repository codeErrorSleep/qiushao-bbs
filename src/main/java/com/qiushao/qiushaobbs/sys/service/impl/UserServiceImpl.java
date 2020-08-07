package com.qiushao.qiushaobbs.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiushao.qiushaobbs.sys.entity.User;
import com.qiushao.qiushaobbs.sys.mapper.UserMapper;
import com.qiushao.qiushaobbs.sys.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 		 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
