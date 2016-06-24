package test_api;

import java.util.HashMap;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetDeviceList {
	
	public static String Method_Device_List = "wicare.devices.list";//获取设备列表信息
	
	public static void main(String [] args){
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//初始化 appkey 和 appsecret 创建应用时可获得
		String fields = "device_id,serial,active_gps_data";
		WopApi.deviceList(getParams(), fields,new Callback() {
			
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
