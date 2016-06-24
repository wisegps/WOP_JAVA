package test_api;

import java.util.HashMap;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetAirDataList {

	public static String Method_Air_Datas_List = "wicare.air_datas.list";
	
	public static void main(String [] args){
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//初始化 appkey 和 appsecret 创建应用时可获得
		String fields = "rcv_time,air";
		WopApi.getAirDataList(getParams(), fields,new Callback() {
			
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
		params.put("serial", TestConfig.serial);
		params.put("rcv_time", "2016-05-30 00:00:00@2016-06-10 15:59:59");
//		params.put("page", "");
		params.put("min_id", "0");
		params.put("max_id", "0");
		params.put("limit", "2");
		return params;
	}
}
