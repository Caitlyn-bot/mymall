package com.zzw.mymall.general;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 张志伟
 * @version v1.0
 */
public interface GeneralDao<T> extends Mapper<T> , MySqlMapper<T> {

}
