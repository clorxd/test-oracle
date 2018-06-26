package com.test.dao;

import com.test.model.TDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import com.test.provider.BaseProvider;

import java.util.List;

/**
 * @author chenxing
 *         Created by ChenXing on 2018/6/22.
 */
@Mapper
public interface TDomainDao {

    @SelectProvider(type = BaseProvider.class, method = "getAll")
    @ResultMap("getMap")
    public List<TDomain> searchDomain(TDomain domain);
}
