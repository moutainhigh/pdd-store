package com.pdd.payMgr.common.receive;

/**
 * 从微信Api接收到的对象
 * （微信通知接口）
 * @author Wu.Liang
 * @Date 2018年3月6日
 */
public class ReceiveFromWechatNotify {
	/**
	 * 返回状态码 是 String(16) SUCCESS SUCCESS/FAIL
	 * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
	 */
	private String return_code;
	/**
	 * 返回信息 否 String(128) 签名失败 返回信息，如非空，为错误原因 签名失败 参数格式校验错误
	 */
	private String return_msg;
	
	/*----------- 以下字段在return_code为SUCCESS的时候有返回 -------------------*/
	private String appid; //应用ID  是 String(32) wx8888888888888888 微信开放平台审核通过的应用APPID 
	private String mch_id;	//商户号  是 String(32) 1900000109 微信支付分配的商户号 
	private String device_info;	//设备号 device_info 否 String(32) 013467007045764 微信支付分配的终端设备号， 
	private String nonce_str;	//随机字符串  是 String(32) 5K8264ILTKCH16CQ2502SI8ZNMTM67VS 随机字符串，不长于32位 
	private String sign;	//签名  是 String(32) C380BEC2BFD727A4B6845133519F3AD6 签名，详见签名算法 
	private String result_code;	//业务结果  是 String(16) SUCCESS SUCCESS/FAIL 
	private String err_code;	//错误代码  否 String(32) SYSTEMERROR 错误返回的信息描述 
	private String err_code_des;	//错误代码描述  否 String(128) 系统错误 错误返回的信息描述 
	private String openid;	//用户标识  是 String(128) wxd930ea5d5a258f4f 用户在商户appid下的唯一标识 
	private String is_subscribe;	//是否关注公众账号  否 String(1) Y 用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效 
	private String trade_type;	//交易类型  是 String(16) APP APP 
	private String bank_type;	//付款银行  是 String(16) CMC 银行类型，采用字符串类型的银行标识，银行类型见银行列表 
	private int total_fee;	//总金额  是 Int 100 订单总金额，单位为分 
	private String fee_type;	//货币种类  否 String(8) CNY 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型 
	private int cash_fee;	//现金支付金额  是 Int 100 现金支付金额订单现金支付金额，详见支付金额 
	private String cash_fee_type;	//现金支付货币类型  否 String(16) CNY 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型 
	private int coupon_fee;	//代金券金额  否 Int 10 代金券或立减优惠金额<=订单总金额，订单总金额-代金券或立减优惠金额=现金支付金额，详见支付金额 
	private int coupon_count;	//代金券使用数量  否 Int 1 代金券或立减优惠使用数量 
	private String coupon_id_$n;	//代金券ID  否 String(20)  10000 代金券或立减优惠ID,$n为下标，从0开始编号 
	private int coupon_fee_$n;	//单个代金券支付金额  否 Int 100 单个代金券或立减优惠支付金额,$n为下标，从0开始编号 
	private String transaction_id;	//微信支付订单号  是 String(32) 1217752501201407033233368018 微信支付订单号 
	private String out_trade_no;	//商户订单号  是 String(32) 1212321211201407033568112322 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。 
	private String attach;	//商家数据包  否 String(128) 123456 商家数据包，原样返回 
	private String time_end;	//支付完成时间  是 String(14) 20141030133525 支付完成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则 
	public String getReturn_code() {
		return return_code;
	}
	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}
	public String getReturn_msg() {
		return return_msg;
	}
	public void setReturn_msg(String return_msg) {
		this.return_msg = return_msg;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getMch_id() {
		return mch_id;
	}
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	public String getDevice_info() {
		return device_info;
	}
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}
	public String getNonce_str() {
		return nonce_str;
	}
	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getResult_code() {
		return result_code;
	}
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}
	public String getErr_code() {
		return err_code;
	}
	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}
	public String getErr_code_des() {
		return err_code_des;
	}
	public void setErr_code_des(String err_code_des) {
		this.err_code_des = err_code_des;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getIs_subscribe() {
		return is_subscribe;
	}
	public void setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public String getBank_type() {
		return bank_type;
	}
	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}
	public int getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}
	public String getFee_type() {
		return fee_type;
	}
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	public int getCash_fee() {
		return cash_fee;
	}
	public void setCash_fee(int cash_fee) {
		this.cash_fee = cash_fee;
	}
	public String getCash_fee_type() {
		return cash_fee_type;
	}
	public void setCash_fee_type(String cash_fee_type) {
		this.cash_fee_type = cash_fee_type;
	}
	public int getCoupon_fee() {
		return coupon_fee;
	}
	public void setCoupon_fee(int coupon_fee) {
		this.coupon_fee = coupon_fee;
	}
	public int getCoupon_count() {
		return coupon_count;
	}
	public void setCoupon_count(int coupon_count) {
		this.coupon_count = coupon_count;
	}
	public String getCoupon_id_$n() {
		return coupon_id_$n;
	}
	public void setCoupon_id_$n(String coupon_id_$n) {
		this.coupon_id_$n = coupon_id_$n;
	}
	public int getCoupon_fee_$n() {
		return coupon_fee_$n;
	}
	public void setCoupon_fee_$n(int coupon_fee_$n) {
		this.coupon_fee_$n = coupon_fee_$n;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getTime_end() {
		return time_end;
	}
	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}
}
