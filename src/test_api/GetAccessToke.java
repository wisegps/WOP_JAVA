package test_api;

import api.WopApi;

import toolkit.Callback;
import toolkit.Wop;

public class GetAccessToke {
	
	public static String Method_Access_Token    = "wicare.user.access_token";
	
	public static void main(String [] args){
		Wop.init(TestConfig.appKey, TestConfig.appSecret);//��ʼ�� appkey �� appsecret ����Ӧ��ʱ�ɻ��
		WopApi.getToken("shhx", "123456","2",new Callback() {
			
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
	
	
//	{"status_code":0,"access_token":"471e62ef530dc1f75f198ce58619783a43cbde047fd346129ccb8cbf16a66b501352dd0184c6d1e9aa78a18c5844a577","valid_time":"2016-06-23T08:15:15.177Z","user_id":50}
}
