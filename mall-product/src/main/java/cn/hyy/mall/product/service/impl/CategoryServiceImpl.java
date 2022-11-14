package cn.hyy.mall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.common.utils.Query;

import cn.hyy.mall.product.dao.CategoryDao;
import cn.hyy.mall.product.entity.CategoryEntity;
import cn.hyy.mall.product.service.CategoryService;

import javax.xml.ws.Action;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = this.baseMapper.selectList(null);
        return categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, categoryEntities));
                    return menu;
                }).sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> list) {
        return list.stream().filter(entity -> Objects.equals(entity.getParentCid(), root.getCatId()))
                .map(category -> {
                    category.setChildren(getChildrens(category, list));
                    return category;

                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());

    }
}