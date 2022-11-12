package cn.hyy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:18:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

