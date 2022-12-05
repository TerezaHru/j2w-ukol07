package cz.czechitas.java2webapps.ukol7.service;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    /**
     * Vrací stránkovaný seznam všech osob v databázi seřazených podle příjmení a jména.
     */

    public Page<Post> seznamPost (Pageable pageable) {
       pageable = PageRequest.of(0,20);
        return postRepository.findAll(pageable);
    }

}

