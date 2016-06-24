package test_api;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetDeviceData {
	
	public static void main(String [] args){
		
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//��ʼ�� appkey �� appsecret ����Ӧ��ʱ�ɻ��
		String fields = "device_id,serial,active_gps_data";
		WopApi.getDeviceData(TestConfig.serial, fields,new Callback() {
			
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
	
}
