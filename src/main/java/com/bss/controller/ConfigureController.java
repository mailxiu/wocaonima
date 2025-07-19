/*     */ package com.bss.controller;
/*     */ 
/*     */ import com.alibaba.fastjson.JSON;
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*     */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*     */ import com.baomidou.mybatisplus.core.metadata.IPage;
/*     */ import com.baomidou.mybatisplus.extension.api.ApiController;
/*     */ import com.baomidou.mybatisplus.extension.api.R;
/*     */ import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/*     */ import com.bss.entity.Configure;
/*     */ import com.bss.entity.OfficialConfig;
/*     */ import com.bss.entity.PayVo;
/*     */ import com.bss.entity.User;
/*     */ import com.bss.service.ConfigureService;
/*     */ import com.bss.service.impl.OfficialConfigServiceImpl;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import javax.annotation.Resource;
/*     */ import javax.servlet.http.HttpSession;
/*     */ import org.springframework.web.bind.annotation.DeleteMapping;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
/*     */ import org.springframework.web.bind.annotation.PostMapping;
/*     */ import org.springframework.web.bind.annotation.PutMapping;
/*     */ import org.springframework.web.bind.annotation.RequestBody;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @RestController
/*     */ @RequestMapping({"config"})
/*     */ public class ConfigureController
/*     */   extends ApiController
/*     */ {
/*     */   @Resource
/*     */   private ConfigureService configureService;
/*     */   @Resource
/*     */   private OfficialConfigServiceImpl officialConfigService;
/*     */   
/*     */   @GetMapping
/*     */   public R selectAll(Page<Configure> page, Configure configure) {
/*  49 */     return success(this.configureService.page((IPage)page, (Wrapper)new QueryWrapper(configure)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"{id}"})
/*     */   public R selectOne(@PathVariable Serializable id) {
/*  60 */     return success(this.configureService.getById(id));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/get"})
/*     */   public R selectOneByMerchant(String merchant) {
/*  72 */     Configure configure = (Configure)this.configureService.getOne((Wrapper)(new QueryWrapper()).eq("merchant", merchant));
/*     */     
/*  74 */     return success(configure);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/sel"})
/*     */   public R getMerchantConfig(String merchant) {
/*  95 */     Configure configure = (Configure)this.configureService.getOne((Wrapper)(new QueryWrapper()).eq("merchant", merchant));
/*     */     
/*  97 */     JSONObject configureData = (JSONObject)JSON.toJSON(configure);
/*     */     
/*  99 */     OfficialConfig officialConfig = (OfficialConfig)this.officialConfigService.getOne((Wrapper)new QueryWrapper());
/*     */     
/* 101 */     configureData.put("officialName", officialConfig.getOfficialName());
/*     */     
/* 103 */     configureData.put("officialImage", officialConfig.getOfficialImage());
/*     */     
/* 105 */     JSONObject data = new JSONObject();
/*     */     
/* 107 */     data.put("config", configureData);
/*     */     
/* 109 */     return success(data);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/updatePay"})
/*     */   public R updatePay(PayVo payVo, HttpSession session) {
/* 117 */     User user = (User)session.getAttribute("user");
/*     */     
/* 119 */     if (user == null) {
/* 120 */       return success(Boolean.valueOf(false));
/*     */     }
/*     */     
/* 123 */     Configure configure = (Configure)this.configureService.getOne((Wrapper)(new QueryWrapper()).eq("merchant", user.getMerchant()));
/*     */     
/* 125 */     configure.setPayMode(payVo.getPayMode());
/*     */     
/* 127 */     configure.setPayPoints(payVo.getPayPoints());
/*     */     
/* 129 */     configure.setPayPercent(payVo.getPayPercent());
/*     */     
/* 131 */     configure.setPayStart(payVo.getPayStart());
/*     */     
/* 133 */     configure.setAutomaticPayment(payVo.getAutomaticPayment());
/*     */     
/* 135 */     configure.setPayChannelName(payVo.getPayChannelName());
/*     */     
/* 137 */     configure.setPayChannelImage(payVo.getPayChannelImage());
/*     */     
/* 139 */     configure.setWithdrawalNumber(payVo.getWithdrawalNumber());
/*     */     
/* 141 */     boolean update = this.configureService.saveOrUpdate(configure);
/*     */     
/* 143 */     return success(Boolean.valueOf(update));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PutMapping
/*     */   public R update(@RequestBody Configure configure) {
/* 155 */     return success(Boolean.valueOf(this.configureService.updateById(configure)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @DeleteMapping
/*     */   public R delete(@RequestParam("idList") List<Long> idList) {
/* 166 */     return success(Boolean.valueOf(this.configureService.removeByIds(idList)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yang\Documents\xwechat_files\wxid_3fhkjy8fz0wc11_2b47\msg\file\2025-07\recovery_applet-1.0.3-SNAPSHOT.jar!\BOOT-INF\classes\com\bss\controller\ConfigureController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */