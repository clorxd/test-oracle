package com.test.service;

import com.github.pagehelper.PageInfo;
import com.test.model.TDomain;

/**
 * @author chenxing
 *         Created by ChenXing on 2018/6/22.
 */

public interface TDomainService {
    public PageInfo<TDomain> searchDomain(TDomain domain, int currentPage, int pageSize);
}
