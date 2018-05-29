public class HttpUtill{

	public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(address).build();
		client.newCall(request).enqueue(callback);
	}
}