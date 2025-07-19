/*    */
package com.bss.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/*    */
@TableName("configure")
/*    */ public class Configure {
    private Integer id;
    private String merchant;
    private Integer indexAd;
    private Integer extract;
    /*    */   private Integer marketing;
    /*    */   private Integer notice;
    /*    */   private String noticeUrl;
    /*    */   private Integer payMode;
    /*    */   private Double payPoints;
    /*    */   private Double payPercent;
    /*    */   private Integer payStart;
    /*    */   private Double automaticPayment;

    /*    */
    /* 13 */
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer withdrawalNumber;
    private String payChannelName;
    private String payChannelImage;
    private Integer onlinePayment;
    private Integer onlineAlipay;
    private Integer onlineCustomer;
    private String paymentProvider;
    private Integer paymentPolling;
    private String paymentRouting;
    private Integer wechatLogin;
    private Integer appleLogin;
    private Integer examine;
    private Integer version;

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public void setIndexAd(Integer indexAd) {
        this.indexAd = indexAd;
    }

    public void setExtract(Integer extract) {
        this.extract = extract;
    }

    public void setMarketing(Integer marketing) {
        this.marketing = marketing;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    public void setPayPoints(Double payPoints) {
        this.payPoints = payPoints;
    }

    public void setPayPercent(Double payPercent) {
        this.payPercent = payPercent;
    }

    public void setPayStart(Integer payStart) {
        this.payStart = payStart;
    }

    public void setAutomaticPayment(Double automaticPayment) {
        this.automaticPayment = automaticPayment;
    }

    public void setWithdrawalNumber(Integer withdrawalNumber) {
        this.withdrawalNumber = withdrawalNumber;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    public void setPayChannelImage(String payChannelImage) {
        this.payChannelImage = payChannelImage;
    }

    public void setOnlinePayment(Integer onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void setOnlineAlipay(Integer onlineAlipay) {
        this.onlineAlipay = onlineAlipay;
    }

    public void setOnlineCustomer(Integer onlineCustomer) {
        this.onlineCustomer = onlineCustomer;
    }

    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void setPaymentPolling(Integer paymentPolling) {
        this.paymentPolling = paymentPolling;
    }

    public void setPaymentRouting(String paymentRouting) {
        this.paymentRouting = paymentRouting;
    }

    public void setWechatLogin(Integer wechatLogin) {
        this.wechatLogin = wechatLogin;
    }

    public void setAppleLogin(Integer appleLogin) {
        this.appleLogin = appleLogin;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.bss.entity.Configure)) return false;
        com.bss.entity.Configure other = (com.bss.entity.Configure) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$merchant = getMerchant(), other$merchant = other.getMerchant();
        if ((this$merchant == null) ? (other$merchant != null) : !this$merchant.equals(other$merchant)) return false;
        Object this$indexAd = getIndexAd(), other$indexAd = other.getIndexAd();
        if ((this$indexAd == null) ? (other$indexAd != null) : !this$indexAd.equals(other$indexAd)) return false;
        Object this$extract = getExtract(), other$extract = other.getExtract();
        if ((this$extract == null) ? (other$extract != null) : !this$extract.equals(other$extract)) return false;
        Object this$marketing = getMarketing(), other$marketing = other.getMarketing();
        if ((this$marketing == null) ? (other$marketing != null) : !this$marketing.equals(other$marketing))
            return false;
        Object this$notice = getNotice(), other$notice = other.getNotice();
        if ((this$notice == null) ? (other$notice != null) : !this$notice.equals(other$notice)) return false;
        Object this$noticeUrl = getNoticeUrl(), other$noticeUrl = other.getNoticeUrl();
        if ((this$noticeUrl == null) ? (other$noticeUrl != null) : !this$noticeUrl.equals(other$noticeUrl))
            return false;
        Object this$payMode = getPayMode(), other$payMode = other.getPayMode();
        if ((this$payMode == null) ? (other$payMode != null) : !this$payMode.equals(other$payMode)) return false;
        Object this$payPoints = getPayPoints(), other$payPoints = other.getPayPoints();
        if ((this$payPoints == null) ? (other$payPoints != null) : !this$payPoints.equals(other$payPoints))
            return false;
        Object this$payPercent = getPayPercent(), other$payPercent = other.getPayPercent();
        if ((this$payPercent == null) ? (other$payPercent != null) : !this$payPercent.equals(other$payPercent))
            return false;
        Object this$payStart = getPayStart(), other$payStart = other.getPayStart();
        if ((this$payStart == null) ? (other$payStart != null) : !this$payStart.equals(other$payStart)) return false;
        Object this$automaticPayment = getAutomaticPayment(), other$automaticPayment = other.getAutomaticPayment();
        if ((this$automaticPayment == null) ? (other$automaticPayment != null) : !this$automaticPayment.equals(other$automaticPayment))
            return false;
        Object this$withdrawalNumber = getWithdrawalNumber(), other$withdrawalNumber = other.getWithdrawalNumber();
        if ((this$withdrawalNumber == null) ? (other$withdrawalNumber != null) : !this$withdrawalNumber.equals(other$withdrawalNumber))
            return false;
        Object this$payChannelName = getPayChannelName(), other$payChannelName = other.getPayChannelName();
        if ((this$payChannelName == null) ? (other$payChannelName != null) : !this$payChannelName.equals(other$payChannelName))
            return false;
        Object this$payChannelImage = getPayChannelImage(), other$payChannelImage = other.getPayChannelImage();
        if ((this$payChannelImage == null) ? (other$payChannelImage != null) : !this$payChannelImage.equals(other$payChannelImage))
            return false;
        Object this$onlinePayment = getOnlinePayment(), other$onlinePayment = other.getOnlinePayment();
        if ((this$onlinePayment == null) ? (other$onlinePayment != null) : !this$onlinePayment.equals(other$onlinePayment))
            return false;
        Object this$onlineAlipay = getOnlineAlipay(), other$onlineAlipay = other.getOnlineAlipay();
        if ((this$onlineAlipay == null) ? (other$onlineAlipay != null) : !this$onlineAlipay.equals(other$onlineAlipay))
            return false;
        Object this$onlineCustomer = getOnlineCustomer(), other$onlineCustomer = other.getOnlineCustomer();
        if ((this$onlineCustomer == null) ? (other$onlineCustomer != null) : !this$onlineCustomer.equals(other$onlineCustomer))
            return false;
        Object this$paymentProvider = getPaymentProvider(), other$paymentProvider = other.getPaymentProvider();
        if ((this$paymentProvider == null) ? (other$paymentProvider != null) : !this$paymentProvider.equals(other$paymentProvider))
            return false;
        Object this$paymentPolling = getPaymentPolling(), other$paymentPolling = other.getPaymentPolling();
        if ((this$paymentPolling == null) ? (other$paymentPolling != null) : !this$paymentPolling.equals(other$paymentPolling))
            return false;
        Object this$paymentRouting = getPaymentRouting(), other$paymentRouting = other.getPaymentRouting();
        if ((this$paymentRouting == null) ? (other$paymentRouting != null) : !this$paymentRouting.equals(other$paymentRouting))
            return false;
        Object this$wechatLogin = getWechatLogin(), other$wechatLogin = other.getWechatLogin();
        if ((this$wechatLogin == null) ? (other$wechatLogin != null) : !this$wechatLogin.equals(other$wechatLogin))
            return false;
        Object this$appleLogin = getAppleLogin(), other$appleLogin = other.getAppleLogin();
        if ((this$appleLogin == null) ? (other$appleLogin != null) : !this$appleLogin.equals(other$appleLogin))
            return false;
        Object this$examine = getExamine(), other$examine = other.getExamine();
        if ((this$examine == null) ? (other$examine != null) : !this$examine.equals(other$examine)) return false;
        Object this$version = getVersion(), other$version = other.getVersion();
        return !((this$version == null) ? (other$version != null) : !this$version.equals(other$version));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.bss.entity.Configure;
    }


    public String toString() {
        return "Configure(id=" + getId() + ", merchant=" + getMerchant() + ", indexAd=" + getIndexAd() + ", extract=" + getExtract() + ", marketing=" + getMarketing() + ", notice=" + getNotice() + ", noticeUrl=" + getNoticeUrl() + ", payMode=" + getPayMode() + ", payPoints=" + getPayPoints() + ", payPercent=" + getPayPercent() + ", payStart=" + getPayStart() + ", automaticPayment=" + getAutomaticPayment() + ", withdrawalNumber=" + getWithdrawalNumber() + ", payChannelName=" + getPayChannelName() + ", payChannelImage=" + getPayChannelImage() + ", onlinePayment=" + getOnlinePayment() + ", onlineAlipay=" + getOnlineAlipay() + ", onlineCustomer=" + getOnlineCustomer() + ", paymentProvider=" + getPaymentProvider() + ", paymentPolling=" + getPaymentPolling() + ", paymentRouting=" + getPaymentRouting() + ", wechatLogin=" + getWechatLogin() + ", appleLogin=" + getAppleLogin() + ", examine=" + getExamine() + ", version=" + getVersion() + ")";
    }

    /*    */
    public Integer getId() {
        /* 15 */
        return this.id;
        /*    */
    }

    public String getMerchant() {
        /* 17 */
        return this.merchant;
        /*    */
    }

    public Integer getIndexAd() {
        /* 19 */
        return this.indexAd;
        /*    */
    }

    public Integer getExtract() {
        /* 21 */
        return this.extract;
        /*    */
    }

    public Integer getMarketing() {
        /* 23 */
        return this.marketing;
        /*    */
    }

    public Integer getNotice() {
        /* 25 */
        return this.notice;
        /*    */
    }

    public String getNoticeUrl() {
        /* 27 */
        return this.noticeUrl;
        /*    */
    }

    public Integer getPayMode() {
        /* 29 */
        return this.payMode;
        /*    */
    }

    public Double getPayPoints() {
        /* 31 */
        return this.payPoints;
        /*    */
    }

    public Double getPayPercent() {
        /* 33 */
        return this.payPercent;
        /*    */
    }

    public Integer getPayStart() {
        /* 35 */
        return this.payStart;
        /*    */
    }

    public Double getAutomaticPayment() {
        /* 37 */
        return this.automaticPayment;
        /*    */
    }

    public Integer getWithdrawalNumber() {
        /* 39 */
        return this.withdrawalNumber;
        /*    */
    }

    public String getPayChannelName() {
        /* 41 */
        return this.payChannelName;
        /*    */
    }

    public String getPayChannelImage() {
        /* 43 */
        return this.payChannelImage;
        /*    */
    }

    public Integer getOnlinePayment() {
        /* 45 */
        return this.onlinePayment;
        /*    */
    }

    public Integer getOnlineAlipay() {
        /* 47 */
        return this.onlineAlipay;
        /*    */
    }

    public Integer getOnlineCustomer() {
        /* 49 */
        return this.onlineCustomer;
        /*    */
    }

    public String getPaymentProvider() {
        /* 51 */
        return this.paymentProvider;
        /*    */
    }

    public Integer getPaymentPolling() {
        /* 53 */
        return this.paymentPolling;
        /*    */
    }

    public String getPaymentRouting() {
        /* 55 */
        return this.paymentRouting;
        /*    */
    }

    public Integer getWechatLogin() {
        /* 57 */
        return this.wechatLogin;
        /*    */
    }

    public Integer getAppleLogin() {
        /* 59 */
        return this.appleLogin;
        /*    */
    }

    public Integer getExamine() {
        /* 61 */
        return this.examine;
        /*    */
    }

    public Integer getVersion() {
        /* 63 */
        return this.version;
        /*    */
    }
}


/* Location:              C:\Users\yang\Documents\xwechat_files\wxid_3fhkjy8fz0wc11_2b47\msg\file\2025-07\recovery_applet-1.0.3-SNAPSHOT.jar!\BOOT-INF\classes\com\bss\entity\Configure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */