package fileHandling.point;
import java.io.*;
import java.util.*;
public class DistanceCalculation {
	
	public void readCsv(String input) throws IOException { // address points.csv
		BufferedReader buffer = new BufferedReader(new FileReader(input));
		String line = buffer.readLine(); // columnName
		
		List<Point> pointList = new ArrayList<Point>();
		
		line = buffer.readLine();
		while(line !=null) {
			pointList.add(getPoint(line));
			line = buffer.readLine();
		}
		
		buffer.close();
		
		for(Point p : pointList) {
			System.out.println(p);
		}
		
		Map<String,Double> distanceList = getDistanceBetweenTwoPoints(pointList);
		sortList(distanceList);
		
	}

	public void sortList(Map<String,Double> distanceList) {
		TreeMap<String,Double> sort = new TreeMap<String,Double>(new DistanceComparator(distanceList));
		sort.putAll(distanceList);
		System.out.println("------------------------------------------------------------------");
		for(Map.Entry<String, Double> e : sort.entrySet()) {
			System.out.println(e);
		}
		
	}

	public Map<String,Double> getDistanceBetweenTwoPoints(List<Point> pointList) {
		Map<String,Double> distanceList = new HashMap<String,Double>();
		
		for(int i = 0 ; i < pointList.size(); i++) {
			Point p1 = pointList.get(i);
			float x1 = p1.getX();
			float y1 = p1.getY();
			
			
			for(int j = i+1;j<pointList.size();j++) {
				Point p2 = pointList.get(j);
				float x2 = p2.getX();
				float y2 = p2.getY();
				
				double distance = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
				distanceList.put(p1 + "  " + p2 , distance);
			}
			
			
		}
		return distanceList;
		
	}

	public Point getPoint(String line) {
		String data[] = line.split(",");
		String name = data[0];
		float x = Float.parseFloat(data[1]);
		float y = Float.parseFloat(data[2]);
		
		
		return new Point(name, x, y);
		
	}

}

package fileHandling.point;

import java.util.Comparator;
import java.util.Map;

public class DistanceComparator implements Comparator<String> {

	private Map<String,Double> distanceList;

	public DistanceComparator(Map<String, Double> distanceList) {
		super();
		this.distanceList = distanceList;
	}

	@Override
	public int compare(String key1, String key2) {
		double value1 = distanceList.get(key1);
		double value2 = distanceList.get(key2);
		
		if(value1 > value2)
			return 1;
		else
			return -1;
	}
	
	
}

package fileHandling.point;

public class Point {
	private String name;
	private float x,y;
	public Point(String name, float x, float y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public String toString() {
		return name +"(" + x + "," + y + ")";
	}

}

package fileHandling.point;

import java.io.IOException;

public class PointInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DistanceCalculation cal = new DistanceCalculation();
		cal.readCsv("points.csv");
	}

}
