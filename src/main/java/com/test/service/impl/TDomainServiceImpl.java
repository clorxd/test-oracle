package com.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.dao.TDomainDao;
import com.test.model.TDomain;
import com.test.service.TDomainService;

import java.util.List;

/**
 * @author chenxing
 *         Created by ChenXing on 2018/6/22.
 */
@Service
public class TDomainServiceImpl implements TDomainService {

    @Autowired
    TDomainDao tDomainDao;

    @Override
    public PageInfo<TDomain> searchDomain(TDomain domain, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<TDomain> domains=tDomainDao.searchDomain(domain);
        return new PageInfo<>(domains);
    }

}
