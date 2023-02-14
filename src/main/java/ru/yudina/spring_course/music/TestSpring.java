package ru.yudina.spring_course.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//        System.out.println(comparison);
//
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer2.getVolume());
//        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
