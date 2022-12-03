package cz.czechitas.java2webapps.ukol7.controller;

        import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
        import cz.czechitas.java2webapps.ukol7.service.PostService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.propertyeditors.StringTrimmerEditor;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.web.PageableDefault;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.WebDataBinder;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.InitBinder;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class PostController {
//
    private final PostService service;
    public  PostController(PostService service) {this.service = service; }
    @GetMapping("/")
    public ModelAndView zakladniSeznam(@PageableDefault() Pageable pageable) {
     return new ModelAndView("index")
                .addObject("index", service.seznamPost(pageable));
    }

    /*
    private final PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @InitBinder
    public void nullStringBinding(WebDataBinder binder) {
        //prázdné textové řetězce nahradit null hodnotou
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @GetMapping("/")
    public Object index() {
        return new ModelAndView("index")
                .addObject("posts", postRepository.findAll());
    }

    */



}
