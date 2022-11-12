package cn.hyy.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
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
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long orderReturnId;
	/**
	 * 
	 */
	private BigDecimal refund;
	/**
	 * 
	 */
	private String refundSn;
	/**
	 * 
	 */
	private Integer refundStatus;
	/**
	 * 
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
