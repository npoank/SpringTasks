package org.andrew.springtasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Classic implements Music{
    private List<String> song = new ArrayList<>();

    public Classic() {
        song.add("Classic song 1");
        song.add("Classic song 2");
        song.add("Classic song 3");
    }

    @Override
    public List<String> getSong() {
        return song;
    }
}
