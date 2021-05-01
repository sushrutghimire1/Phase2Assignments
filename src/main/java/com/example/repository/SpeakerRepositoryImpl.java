package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        speakers.add(new Speaker("Sushrut", "Ghimire"));
        speakers.add(new Speaker("Rahul", "Dravid"));
        return speakers;
    }
}
