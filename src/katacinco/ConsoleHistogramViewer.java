
package katacinco;


public class ConsoleHistogramViewer<T> implements HistogramViewer<T>{
    
    @Override
    public void show(Histogram<T> histogram){
        for (T key : histogram.keySet()) {
            System.out.println(key + ": "+ histogram.get(key));
        }
    }
    
}
