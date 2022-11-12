package cn.hyy.mall.product.dao;

import cn.hyy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 14:30:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
