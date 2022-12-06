package cz.czechitas.java2webapps.ukol7.service;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

/**
 * Služba pro práci s osobami a adresami.
 */
@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<Post> seznamPost (Pageable pageable) {
        return postRepository.findAll(pageable);
    }
    public Page<Post> seznamDleZverejneni(LocalDate date , Pageable pageable) {
        LocalDate datum = LocalDate.now();
        return postRepository.findByDatumBefore(datum, pageable);
    }


}

