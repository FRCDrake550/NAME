package Atom;

public class Atom {

	public void simpleTest() {
	    double testdata[][] = {
	            {-1.0,1.0,0.0,1.0}, // 100% fwd, 100% left
	            {-1.0,0.5,-0.5,-1.0}, // 50% fwd, 100% left
	            {-1.0,0,-1.0,1.0}, // 0%fwd, 100% left
	            {-1.0,-0.5,-1.0,0.5}, // 50% back, 100% left
	            {-1.0,-1.0,-1.0,0}, // 100% back, 100% left
	            {-1.0,1.0,0.0,1.0}, // 100% fwd, 100% left
	            {-1.0,0.5,-0.5,-1.0}, // 50% fwd, 100% left
	            {-1.0,0,-1.0,1.0}, // 0%fwd, 100% left
	            {-1.0,-0.5,-1.0,0.5}, // 50% back, 100% left
	            {-1.0,-1.0,-1.0,0}, // 100% back, 100% left
	    };
	    for (int i=0;i<testdata.length;i++) {
	        TankDriveValues tdVal = getTankDriveValues(testdata[i][0], testdata[i][1]);
	        if ((tdVal.left != testdata[i][2]) && (tdVal.right  != testdata[i][3])) {
	            System.out.println("Unexpected result. For x=" + testdata[i][0] + " and y=" + testdata[i][1] + " expected l=" + testdata[i][2] + " and r=" + testdata[i][3] + " instead received l=" + tdVal.left + " and r=" + tdVal.right);
	        } else {
	            System.out.println("Expected result. For x=" + testdata[i][0] + " and y=" + testdata[i][1] + ", l=" + tdVal.left + " and r=" + tdVal.right);
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
