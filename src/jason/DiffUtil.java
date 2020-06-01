package jason;

public class DiffUtil {

	static{
		System.loadLibrary("BsDiffUtil");
	}

	
	public static native void diffApk(String oldPath, String newPath, String patch);
	
	public static void callBack() {
		
	}
}
