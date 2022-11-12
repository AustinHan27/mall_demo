package cn.hyy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.hyy.common.utils.PageUtils;
import cn.hyy.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:12:50
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

