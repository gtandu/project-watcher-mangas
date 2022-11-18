package fr.gtandu;

import fr.gtandu.document.Manga;
import fr.gtandu.repository.MangaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@Slf4j
public class MangasApplication implements CommandLineRunner {

    @Autowired
    private MangaRepository mangaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MangasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mangaRepository.save(Manga.builder().id("test").name("1234").review("1234").build()).subscribe();
    }
}
