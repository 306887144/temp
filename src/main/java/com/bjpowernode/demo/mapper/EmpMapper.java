package com.bjpowernode.demo.mapper;

import com.bjpowernode.demo.domain.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 30688
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2023-10-11 09:10:28
* @Entity com.bjpowernode.demo.domain.Emp
*/
public interface EmpMapper extends BaseMapper<Emp> {

    Emp findByEmpNo(@Param("empNo") Integer empNo);

}




