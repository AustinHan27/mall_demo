package cn.hyy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 14:30:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

