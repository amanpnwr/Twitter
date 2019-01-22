import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;


public class MySQLChart {
	    
	    private static JDBCCategoryDataset dataset;

	    public static void main(String[] args) throws IOException, SQLException {

	        Connection con = null;

	        String url = "jdbc:mysql://localhost:3306/userdb";
	        String user = "mysql";
	        String password = "mysql";

	        try {

	            con = DriverManager.getConnection(url, user, password);
	            dataset = new JDBCCategoryDataset(con);
	            dataset.executeQuery("SELECT NAME, AGE FROM customer");

	        } finally {

	            if (con != null) {
	                con.close();
	            }
	        }

	        JFreeChart barChart = ChartFactory.createBarChart(
	                "Id of customers",
	                "",
	                "Customer",
	                dataset,
	                PlotOrientation.VERTICAL,
	                false, true, false);

	        ChartUtilities.saveChartAsPNG(new File("cust.png"), barChart, 450, 400);
	    }
	}
	
