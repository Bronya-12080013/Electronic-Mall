package com.lan.electronicmall.nosql.mongodb.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**  实体对象
 * 用户商品浏览历史记录
 * 会员浏览记录文档对象MemberReadHistory
 * 文档对象的ID域添加@Id注解，需要检索的字段添加@Indexed注解。
 *
 * @Document:标示映射到Mongodb文档上的领域对象
 * @Id:标示某个域为ID域
 * @Indexed:标示某个字段为Mongodb的索引字段
 */
@Document
public class MemberReadHistory {

    @Id
    private String id;
    @Indexed
    private Long memberId; //会员身份
    private String memberNickname; // 会员名称
    private String memberIcon;//会员图标
    @Indexed
    private Long productId;
    private String productName;//产品名称
    private String productPic;//产品图
    private String productSubTitle;//产品副标题
    private String productPrice;//产品价格
    private Date createTime;//创建时间。
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
