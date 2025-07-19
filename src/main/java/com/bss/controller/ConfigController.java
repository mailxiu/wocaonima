/*     */ package com.bss.controller;
/*     */ 
/*     */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*     */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*     */ import com.bss.entity.AppletConfig;
/*     */ import com.bss.entity.ArticleConfig;
/*     */ import com.bss.entity.Configure;
/*     */ import com.bss.entity.MessageConfig;
/*     */ import com.bss.entity.OfficialConfig;
/*     */ import com.bss.entity.PayAlipayConfig;
/*     */ import com.bss.entity.PaymentConfig;
/*     */ import com.bss.entity.PresetConfig;
/*     */ import com.bss.entity.SystemConfig;
/*     */ import com.bss.entity.User;
/*     */ import com.bss.entity.WechatAppPayConfig;
/*     */ import com.bss.service.impl.AppletConfigServiceImpl;
/*     */ import com.bss.service.impl.ArticleConfigServiceImpl;
/*     */ import com.bss.service.impl.ConfigureServiceImpl;
/*     */ import com.bss.service.impl.MessageConfigServiceImpl;
/*     */ import com.bss.service.impl.OfficialConfigServiceImpl;
/*     */ import com.bss.service.impl.PayAlipayConfigServiceImpl;
/*     */ import com.bss.service.impl.PaymentConfigServiceImpl;
/*     */ import com.bss.service.impl.PresetConfigServiceImpl;
/*     */ import com.bss.service.impl.SystemConfigServiceImpl;
/*     */ import com.bss.service.impl.WechatAppPayConfigServiceImpl;
/*     */ import com.bss.utils.R;
/*     */ import javax.annotation.Resource;
/*     */ import javax.servlet.http.HttpSession;
/*     */ import org.springframework.beans.BeanUtils;
/*     */ import org.springframework.web.bind.annotation.ModelAttribute;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ 
/*     */ 
/*     */ @RequestMapping({"/config"})
/*     */ @RestController
/*     */ public class ConfigController
/*     */ {
/*     */   @Resource
/*     */   private PayAlipayConfigServiceImpl payAlipayConfigService;
/*     */   @Resource
/*     */   private PaymentConfigServiceImpl paymentConfigService;
/*     */   @Resource
/*     */   private AppletConfigServiceImpl appletConfigService;
/*     */   @Resource
/*     */   private OfficialConfigServiceImpl officialConfigService;
/*     */   @Resource
/*     */   private ConfigureServiceImpl configureService;
/*     */   @Resource
/*     */   private SystemConfigServiceImpl systemConfigService;
/*     */   @Resource
/*     */   private ArticleConfigServiceImpl articleConfigService;
/*     */   @Resource
/*     */   private MessageConfigServiceImpl messageConfigService;
/*     */   @Resource
/*     */   private PresetConfigServiceImpl presetConfigService;
/*     */   @Resource
/*     */   private WechatAppPayConfigServiceImpl wechatAppPayConfigService;
/*     */   
/*     */   @RequestMapping({"/payment"})
/*     */   public R payment(String merchantId, String merchantSerialNumber, String apiV3Key, String privateKeyFromPath, String publicKeyFromPath, String publicKeyId) {
/*  63 */     PaymentConfig payment = (PaymentConfig)this.paymentConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/*  65 */     if (payment == null) {
/*  66 */       payment = new PaymentConfig();
/*  67 */       payment.setId(Integer.valueOf(0));
/*     */     } 
/*     */     
/*  70 */     payment.setMerchantId(merchantId);
/*  71 */     payment.setMerchantSerialNumber(merchantSerialNumber);
/*  72 */     payment.setApiV3Key(apiV3Key);
/*  73 */     payment.setPrivateKeyFromPath(privateKeyFromPath);
/*  74 */     payment.setPublicKeyFromPath(publicKeyFromPath);
/*  75 */     payment.setPublicKeyId(publicKeyId);
/*     */     
/*  77 */     boolean saveOrUpdate = this.paymentConfigService.saveOrUpdate(payment);
/*     */     
/*  79 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/weChatAppPay"})
/*     */   public R weChatAppPay(String merchantId, String merchantSerialNumber, String apiV3Key, String privateKeyFromPath, String publicKeyFromPath, String publicKeyId) {
/*  90 */     WechatAppPayConfig payment = (WechatAppPayConfig)this.wechatAppPayConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/*  92 */     if (payment == null) {
/*  93 */       payment = new WechatAppPayConfig();
/*  94 */       payment.setId(Integer.valueOf(0));
/*     */     } 
/*     */     
/*  97 */     payment.setMerchantId(merchantId);
/*  98 */     payment.setMerchantSerialNumber(merchantSerialNumber);
/*  99 */     payment.setApiV3Key(apiV3Key);
/* 100 */     payment.setPrivateKeyFromPath(privateKeyFromPath);
/* 101 */     payment.setPublicKeyFromPath(publicKeyFromPath);
/* 102 */     payment.setPublicKeyId(publicKeyId);
/*     */     
/* 104 */     boolean saveOrUpdate = this.wechatAppPayConfigService.saveOrUpdate(payment);
/*     */     
/* 106 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/alipay"})
/*     */   public R alipay(String appid, String privateKey, String alipayPublicKey) {
/* 121 */     PayAlipayConfig payAlipayConfig = (PayAlipayConfig)this.payAlipayConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 123 */     if (payAlipayConfig == null) {
/* 124 */       payAlipayConfig = new PayAlipayConfig();
/* 125 */       payAlipayConfig.setId(Integer.valueOf(0));
/*     */     } 
/* 127 */     payAlipayConfig.setAppid(appid);
/* 128 */     payAlipayConfig.setPrivateKey(privateKey);
/* 129 */     payAlipayConfig.setAlipayPublicKey(alipayPublicKey);
/*     */     
/* 131 */     boolean saveOrUpdate = this.payAlipayConfigService.saveOrUpdate(payAlipayConfig);
/*     */     
/* 133 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/applet"})
/*     */   public R applet(String appid, String secret) {
/* 146 */     AppletConfig applet = (AppletConfig)this.appletConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 148 */     if (applet == null) {
/* 149 */       applet = new AppletConfig();
/* 150 */       applet.setId(Integer.valueOf(0));
/*     */     } 
/* 152 */     applet.setAppId(appid);
/* 153 */     applet.setSecret(secret);
/*     */     
/* 155 */     boolean saveOrUpdate = this.appletConfigService.saveOrUpdate(applet);
/*     */     
/* 157 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/official"})
/*     */   public R official(String appid, String appSecret, String officialName, String officialImage) {
/* 170 */     OfficialConfig officialConfig = (OfficialConfig)this.officialConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 172 */     if (officialConfig == null) {
/* 173 */       officialConfig = new OfficialConfig();
/* 174 */       officialConfig.setId(Integer.valueOf(0));
/*     */     } 
/*     */     
/* 177 */     officialConfig.setAppId(appid);
/* 178 */     officialConfig.setAppSecret(appSecret);
/* 179 */     officialConfig.setOfficialName(officialName);
/* 180 */     officialConfig.setOfficialImage(officialImage);
/*     */     
/* 182 */     boolean saveOrUpdate = this.officialConfigService.saveOrUpdate(officialConfig);
/*     */     
/* 184 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/configure"})
/*     */   public R configure(Integer extract, Integer indexAd, Integer marketing, Integer onlinePayment, Integer onlineAlipay, Integer onlineCustomer, String paymentProvider, Integer paymentPolling, String paymentRouting, Integer wechatLogin, Integer appleLogin, Integer examine, Integer version, HttpSession session) {
/* 195 */     User user = (User)session.getAttribute("user");
/*     */     
/* 197 */     Configure configure = (Configure)this.configureService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 199 */     if (configure == null) {
/* 200 */       configure = new Configure();
/* 201 */       configure.setId(Integer.valueOf(0));
/* 202 */       configure.setMerchant(user.getMerchant());
/*     */     } 
/* 204 */     configure.setIndexAd(indexAd);
/* 205 */     configure.setExtract(extract);
/* 206 */     configure.setMarketing(marketing);
/* 207 */     configure.setOnlinePayment(onlinePayment);
/* 208 */     configure.setOnlineAlipay(onlineAlipay);
/* 209 */     configure.setOnlineCustomer(onlineCustomer);
/* 210 */     configure.setPaymentProvider(paymentProvider);
/* 211 */     configure.setPaymentPolling(paymentPolling);
/* 212 */     configure.setPaymentRouting(paymentRouting);
/* 213 */     configure.setWechatLogin(wechatLogin);
/* 214 */     configure.setAppleLogin(appleLogin);
/* 215 */     configure.setExamine(examine);
/* 216 */     configure.setVersion(version);
/*     */     
/* 218 */     boolean saveOrUpdate = this.configureService.saveOrUpdate(configure);
/*     */     
/* 220 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/system"})
/*     */   public R applet(String serviceUrl, String galleryUrl, String galleryRoute, String websiteTitle, String menuTitle, HttpSession session) {
/* 231 */     User user = (User)session.getAttribute("user");
/*     */     
/* 233 */     SystemConfig systemConfig = (SystemConfig)this.systemConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 235 */     if (systemConfig == null) {
/* 236 */       systemConfig = new SystemConfig();
/* 237 */       systemConfig.setId(Integer.valueOf(0));
/*     */     } 
/* 239 */     systemConfig.setServiceUrl(serviceUrl);
/* 240 */     systemConfig.setGalleryUrl(galleryUrl);
/* 241 */     systemConfig.setGalleryRoute(galleryRoute);
/* 242 */     systemConfig.setWebsiteTitle(websiteTitle);
/* 243 */     systemConfig.setMenuTitle(menuTitle);
/*     */     
/* 245 */     boolean saveOrUpdate = this.systemConfigService.saveOrUpdate(systemConfig);
/*     */     
/* 247 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/article"})
/*     */   public R article(@ModelAttribute ArticleConfig requestData) {
/* 259 */     ArticleConfig articleConfig = (ArticleConfig)this.articleConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 261 */     if (articleConfig == null) {
/* 262 */       articleConfig = new ArticleConfig();
/* 263 */       articleConfig.setId(Integer.valueOf(0));
/*     */     } 
/*     */     
/* 266 */     BeanUtils.copyProperties(requestData, articleConfig, new String[] { "id" });
/*     */     
/* 268 */     boolean saveOrUpdate = this.articleConfigService.saveOrUpdate(articleConfig);
/*     */     
/* 270 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/message"})
/*     */   public R message(String accessKeyId, String accessKeySecret, String regionId, String signName, String templateCode) {
/* 280 */     MessageConfig messageConfig = (MessageConfig)this.messageConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 282 */     if (messageConfig == null) {
/* 283 */       messageConfig = new MessageConfig();
/* 284 */       messageConfig.setId(Integer.valueOf(0));
/*     */     } 
/* 286 */     messageConfig.setAccessKeyId(accessKeyId);
/* 287 */     messageConfig.setAccessKeySecret(accessKeySecret);
/*     */     
/* 289 */     messageConfig.setRegionId(regionId);
/*     */     
/* 291 */     messageConfig.setSignName(signName);
/*     */     
/* 293 */     messageConfig.setTemplateCode(templateCode);
/*     */     
/* 295 */     boolean saveOrUpdate = this.messageConfigService.saveOrUpdate(messageConfig);
/*     */     
/* 297 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/preset"})
/*     */   public R preset(String defaultPortrait, String projectPortrait, HttpSession session) {
/* 310 */     PresetConfig presetConfig = (PresetConfig)this.presetConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 312 */     if (presetConfig == null) {
/* 313 */       presetConfig = new PresetConfig();
/* 314 */       presetConfig.setId(Integer.valueOf(0));
/*     */     } 
/* 316 */     presetConfig.setDefaultPortrait(defaultPortrait);
/* 317 */     presetConfig.setProjectPortrait(projectPortrait);
/*     */     
/* 319 */     boolean saveOrUpdate = this.presetConfigService.saveOrUpdate(presetConfig);
/*     */     
/* 321 */     return R.success(Boolean.valueOf(saveOrUpdate));
/*     */   }
/*     */ }


/* Location:              C:\Users\yang\Documents\xwechat_files\wxid_3fhkjy8fz0wc11_2b47\msg\file\2025-07\recovery_applet-1.0.3-SNAPSHOT.jar!\BOOT-INF\classes\com\bss\controller\ConfigController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */