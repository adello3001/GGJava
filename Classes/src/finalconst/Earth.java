/*
 * 상수(불변의 값)
 *   - static final type constant = value
 *   - 선언할 때 초기값을 지정하거나
 *   - 정적블록에서 초기값을 지정해야 한다.
 * (Math.class)
 *   - public static final double PI = 3.14159265358979323846;
 */
package finalconst;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { // 정적블록
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	public static void main(String[] args) {
		System.out.printf("원주율: (%f) \n", Math.PI);
		System.out.printf("지구의 반지름: %f km \n", Earth.EARTH_RADIUS);
		System.out.printf("지구의 표면적: %f km^2 \n", Earth.EARTH_SURFACE_AREA);
	}
}
