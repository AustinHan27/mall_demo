package cn.hyy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:20:13
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

