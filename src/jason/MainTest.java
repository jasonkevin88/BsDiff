package jason;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldPath = "F:\\Test\\appNew.apk";
		String newPath = "F:\\Test\\appOld.apk";
		String patch = "F:\\Test\\apk.patch";
		System.out.println("bsdiff start");
		DiffUtil.diffApk(oldPath, newPath, patch);
		System.out.println("bsdiff end");
	}

}
