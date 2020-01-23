package katacinco;

import java.io.IOException;

public class Katacinco {

    public static void main(String[] args) throws IOException {
        HistogramBuilder<Mail> builder = new HistogramBuilder(new MockMailLoader().load());
        Histogram<String> histogram= builder.build(new AtributteExtractor<Mail, String>() {

            @Override
            public String extract(Mail mail) {
                return mail.getDomain();
            }
        });
        HistogramViewer<String> viewer = new ChartHistogramViewer();
        viewer.show(histogram);
        
    }
}
