package cn.hyy.mall.member.dao;

import cn.hyy.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:12:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
