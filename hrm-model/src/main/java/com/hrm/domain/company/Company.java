package com.hrm.domain.company;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author elijah
 * @since 2022-08-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("co_company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 企业登录账号ID
     */
    private String managerId;

    /**
     * 当前版本
     */
    private String version;

    /**
     * 续期时间
     */
    private LocalDateTime renewalDate;

    /**
     * 到期时间
     */
    private LocalDateTime expirationDate;

    /**
     * 公司地区
     */
    private String companyArea;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 营业执照-图片ID
     */
    private String businessLicenseId;

    /**
     * 法人代表
     */
    private String legalRepresentative;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 公司规模
     */
    private String companySize;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 审核状态
     */
    private String auditState;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 当前余额
     */
    private Double balance;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
