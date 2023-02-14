package ru.yudina.spring_course.music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Король и шут";
    }
}
