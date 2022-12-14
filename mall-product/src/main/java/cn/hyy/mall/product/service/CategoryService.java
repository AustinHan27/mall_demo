package cn.hyy.mall.product.service;

import cn.hyy.mall.product.vo.Catalogs2Vo;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 14:30:38
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 以树形结构查询所有分类
     *
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     * 批量删除分类
     *
     * @param asList
     */
    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径；
     * [父/子/孙]
     *
     * @param catelogId
     * @return
     */
    Long[] findCatalogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

    /**
     * 查找一级分类，首页显示
     *
     * @return
     */
    List<CategoryEntity> getLevel1Categories();

    /**
     * 查找二级、三级分类，首页显示
     *
     * @return
     */
    Map<String, List<Catalogs2Vo>> getCatalogJson();
}

