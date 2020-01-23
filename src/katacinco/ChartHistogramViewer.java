package katacinco;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class ChartHistogramViewer<T> implements HistogramViewer<T>{
    
    @Override
    public void show(Histogram<T> histogram){
        JFrame frame = new JFrame("HISTOGRAM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(createChartPanel(histogram));
        frame.pack();
        frame.setVisible(true);
    }

    private ChartPanel createChartPanel(Histogram<T> histogram) {
        ChartPanel panel = new ChartPanel(createChart(histogram));
        return panel;
    }

    private JFreeChart createChart(Histogram<T> histogram) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram", "eMails", "Frequency", createDataset(histogram));
        return chart;
    }

    private CategoryDataset createDataset(Histogram<T> histogram) {
        DefaultCategoryDataset set= new DefaultCategoryDataset();
        for (T item : histogram.keySet()) {
            set.addValue(histogram.get(item), "emails", (String)item);
        }
        return set;
    }
}
