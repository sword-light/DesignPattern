package factoryPattern.simpleFactoryPattern2;

public class Client {
	public static void main(String args[]) {
		Chart chart;
		chart = ChartFactory.getChart("histogram"); // 通过静态工厂方法创建产品
		chart.display();
	}
}

//柱状图类：具体产品类	
class HistogramChart implements Chart {
	public HistogramChart() {
		System.out.println("创建柱状图！");
	}

	public void display() {
		System.out.println("显示柱状图！");
	}
}

//饼状图类：具体产品类	
class PieChart implements Chart {
	public PieChart() {
		System.out.println("创建饼状图！");
	}

	public void display() {
		System.out.println("显示饼状图！");
	}
}

//折线图类：具体产品类	
class LineChart implements Chart {
	public LineChart() {
		System.out.println("创建折线图！");
	}

	public void display() {
		System.out.println("显示折线图！");
	}
}

//图表工厂类：工厂类		
class ChartFactory {
	// 静态工厂方法
	public static Chart getChart(String type) {
		Chart chart = null;
		if (type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
			System.out.println("初始化设置柱状图！");
		} else if (type.equalsIgnoreCase("pie")) {
			chart = new PieChart();
			System.out.println("初始化设置饼状图！");
		} else if (type.equalsIgnoreCase("line")) {
			chart = new LineChart();
			System.out.println("初始化设置折线图！");
		}
		return chart;
	}
}