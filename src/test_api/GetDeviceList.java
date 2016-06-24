package test_api;

import java.util.HashMap;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetDeviceList {
	
	public static String Method_Device_List = "wicare.devices.list";//��ȡ�豸�б���Ϣ
	
	public static void main(String [] args){
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//��ʼ�� appkey �� appsecret ����Ӧ��ʱ�ɻ��
		String fields = "device_id,serial,active_gps_data";
		WopApi.deviceList(getParams(), fields,new Callback() {
			
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
	public static HashMap<String, String> getParams(){
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", TestConfig.token);
		params.put("dealer_id", "50");
		params.put("sorts", "device_id");
//		params.put("page", "");
		params.put("min_id", "0");
		params.put("max_id", "0");
		params.put("limit", "-1");
		return params;
	}
	
}
