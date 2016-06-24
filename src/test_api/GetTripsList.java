package test_api;

import java.util.HashMap;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetTripsList {
	
	
	public static String Method_Trips_List = "wicare.trips.list";//��ȡ�豸��ʷ�г�����

	public static void main(String [] args){
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//��ʼ�� appkey �� appsecret ����Ӧ��ʱ�ɻ��
		String fields = "rcv_time,end_time,start_time,cur_fuel,cur_distance,,quick_accel,,quick_break,quick_reflexes,trip_id";
		WopApi.getTripsList(getParams(), fields,new Callback() {
			
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
		params.put("serial", TestConfig.serial);
		params.put("rcv_time", "2016-05-30 00:00:00@2016-06-10 15:59:59");
//		params.put("page", "");
		params.put("min_id", "0");
		params.put("max_id", "0");
		params.put("limit", "2");
		return params;
	}

}
