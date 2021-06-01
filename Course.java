package com.company;

import java.time.Duration;

public class Course {
    private String name;
    private Duration duration;

    Course(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + '\t' + duration.toHours();
    }
}
