package com.scoprion.mall.littlesoft.service.good;

import com.alibaba.druid.util.StringUtils;
import com.scoprion.mall.domain.Good;
import com.scoprion.mall.littlesoft.mapper.GoodWxMapper;
import com.scoprion.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by admin1
 * @created on 2017/11/2.
 */
@Service
public class GoodWxServiceImpl implements GoodWxService {

    @Autowired
    private GoodWxMapper goodWxMapper;

    /**
     * 商品详情
     *
     * @param goodId
     * @return
     */
    @Override
    public BaseResult goodDetail(Long goodId) {
        if(StringUtils.isEmpty(goodId.toString())){
            return BaseResult.error("error","请指定商品id");
        }
        List<Good> result = goodWxMapper.goodDetail(goodId);
        return BaseResult.success(result);
    }
}
