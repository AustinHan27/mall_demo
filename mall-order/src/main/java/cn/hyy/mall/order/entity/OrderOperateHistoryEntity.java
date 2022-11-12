package cn.hyy.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author hanyiyang
 * @email 79199541@qq.com
 * @date 2022-08-02 15:18:25
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long orderId;
	/**
	 * 
	 */
	private String operateMan;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer orderStatus;
	/**
	 * 
	 */
	private String note;

}
