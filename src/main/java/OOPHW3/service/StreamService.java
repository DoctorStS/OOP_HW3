package OOPHW3.service;

import OOPHW3.data.Stream;
import OOPHW3.data.StreamComparator;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public void createStream(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> getStream() {
        return streams;
    }

    public List<Stream> getSortedStream() {
        List<Stream> sortedStreams = new ArrayList<>(streams);
        sortedStreams.sort(new StreamComparator());
        return sortedStreams;
    }
}