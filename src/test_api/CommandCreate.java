package test_api;

import java.util.HashMap;

import api.WopApi;
import toolkit.Callback;
import toolkit.Wop;

public class CommandCreate {
	
	
	public static final String  AIR_SPEED  = "16453";
	public static final String  AIR_SWITCH = "16451";
	public static final String  AIR_MODEL  = "16452";
	
	public static String Method_Commadn_Create = "wicare.command.create";//向设备发送指令
	
	public static void main(String [] args){
		
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//初始化 appkey 和 appsecret 创建应用时可获得	
		
		WopApi.commandCreate(getAirModeParams(), "",new Callback() {
			
			public void OnSuccess(String response) {
				// TODO Auto-generated method stub
				System.out.println("连接成功返回信息--->" + response);
			}
			
			public void OnFailed(String response) {
				// TODO Auto-generated method stub
				System.out.println("连接失败返回信息--->" + response);
			}
		});
		
	}
	/**
	 * @return
	 */
	public static HashMap<String, String> getAirSwitchParams(){
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", TestConfig.token);
		params.put("device_id", TestConfig.device_id);
		params.put("params", TestConfig.AIR_SWITCH_OFF);
		params.put("cmd_type",TestConfig.AIR_SWITCH);
		return params;
	}
	
	/**
	 * @return
	 */
	public static HashMap<String, String> getAirModeParams(){
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", TestConfig.token);
		params.put("device_id", TestConfig.device_id);
		params.put("params", TestConfig.AIR_MODE_NORMAL);
		params.put("cmd_type", TestConfig.AIR_MODEL);
		return params;
	}
	
	
	/**
	 * @return
	 */
	public static HashMap<String, String> getAirSpeedParams(){
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", TestConfig.token);
		params.put("device_id", TestConfig.device_id);
		params.put("params", TestConfig.AIR_SPEED_MEDIUM);
		params.put("cmd_type", TestConfig.AIR_SPEED);
		return params;
	}
	
	
	
	/*1. 开关净化器
	{switch: 1} 开启
	{switch: 0} 关闭
	2. 设置净化模式
	{air_mode: 1} 手动模式
	{air_mode: 0} 自动模式
	3. 设置净化速度
	{air_speed: 1} 低速模式
	{air_speed: 2} 中速模式
	{air_speed: 3} 高速模式*/
	
	
}
