package cn.hyy.mall.product.service;

import cn.hyy.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 14:30:38
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

