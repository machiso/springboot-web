package com.machi.springbootweb.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dell on 2018/3/1.
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private  String detailId;

    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productIcon;
    private Date createTime;
    private Date updateTime;

}
