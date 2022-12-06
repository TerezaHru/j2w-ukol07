package cz.czechitas.java2webapps.ukol7.controller;

        import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
        import cz.czechitas.java2webapps.ukol7.service.PostService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.domain.Sort;
        import org.springframework.data.web.PageableDefault;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.servlet.ModelAndView;
        import java.time.LocalDate;

@Controller
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }
    @GetMapping("/")
    public ModelAndView zkracenySeznam(LocalDate date, @PageableDefault(page = 0, size=20, sort = {"published"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return new ModelAndView("index")
                .addObject("index", service.seznamDleZverejneni(date, pageable));
    }
    @Autowired
    private PostRepository postReporitory;
    @GetMapping("/detail/{id}")
    public ModelAndView detailPostu(@PathVariable Long id) {
        return new ModelAndView("detail")
                .addObject("post", postReporitory.getReferenceById(id));
    }

}

