package cn.hyy.mall.product.service;

import cn.hyy.mall.product.vo.AttrGroupWithAttrsVo;
import cn.hyy.mall.product.vo.SpuItemAttrGroupVo;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 14:30:38
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    /**
     * 分页查询属性分组三级分类
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 分页查询属性分组三级分类
     * @param params
     * @param catelogId 分类id
     * @return
     */
    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId);
}

