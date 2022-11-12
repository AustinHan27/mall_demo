package cn.hyy.mall.coupon.dao;

import cn.hyy.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:08:03
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
