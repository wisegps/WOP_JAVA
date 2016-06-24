package test_api;

import java.util.HashMap;

import api.WopApi;
import toolkit.Callback;
import toolkit.Wop;

public class CommandCreate {
	
	
	public static final String  AIR_SPEED  = "16453";
	public static final String  AIR_SWITCH = "16451";
	public static final String  AIR_MODEL  = "16452";
	
	public static String Method_Commadn_Create = "wicare.command.create";//���豸����ָ��
	
	public static void main(String [] args){
		
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//��ʼ�� appkey �� appsecret ����Ӧ��ʱ�ɻ��	
		
		WopApi.commandCreate(getAirModeParams(), "",new Callback() {
			
			public void OnSuccess(String response) {
				// TODO Auto-generated method stub
				System.out.println("���ӳɹ�������Ϣ--->" + response);
			}
			
			public void OnFailed(String response) {
				// TODO Auto-generated method stub
				System.out.println("����ʧ�ܷ�����Ϣ--->" + response);
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
	
	
	
	/*1. ���ؾ�����
	{switch: 1} ����
	{switch: 0} �ر�
	2. ���þ���ģʽ
	{air_mode: 1} �ֶ�ģʽ
	{air_mode: 0} �Զ�ģʽ
	3. ���þ����ٶ�
	{air_speed: 1} ����ģʽ
	{air_speed: 2} ����ģʽ
	{air_speed: 3} ����ģʽ*/
	
	
}
