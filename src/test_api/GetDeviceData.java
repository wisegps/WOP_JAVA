package test_api;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetDeviceData {
	
	public static void main(String [] args){
		
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//初始化 appkey 和 appsecret 创建应用时可获得
		String fields = "device_id,serial,active_gps_data";
		WopApi.getDeviceData(TestConfig.serial, fields,new Callback() {
			
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
	
}
