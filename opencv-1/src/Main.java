import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class Main {

    static {
//        System.load(
//            System.getProperty("user.dir")+"/lib/libopencv_java3410.dylib");

                //  System.load("/Users/huaiwen/Documents/jar-package/opencv4/libopencv_java401.dylib");
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public static void main(String[] args) {
        System.out.println("hello");
        // TODO Auto-generated method stub
//      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
        System.out.println( "mat = " + mat.dump() );
    }
}
