package com.bjpowernode.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjpowernode.demo.domain.Emp;
import com.bjpowernode.demo.service.EmpService;
import com.bjpowernode.demo.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author 30688
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2023-10-11 09:10:28
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




