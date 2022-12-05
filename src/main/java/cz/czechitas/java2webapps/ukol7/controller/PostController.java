package cz.czechitas.java2webapps.ukol7.controller;

        import cz.czechitas.java2webapps.ukol7.entity.Post;
        import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
        import cz.czechitas.java2webapps.ukol7.service.PostService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.propertyeditors.StringTrimmerEditor;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.domain.Sort;
        import org.springframework.data.web.PageableDefault;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.WebDataBinder;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.InitBinder;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.server.ResponseStatusException;
        import org.springframework.web.servlet.ModelAndView;


@Controller
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView zakladniSeznam(@PageableDefault(page = 0, size=20, sort = {"published"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return new ModelAndView("index")
                .addObject("index", service.seznamPost(pageable));
    }

    @Autowired
    private PostRepository postReporitory;
    @GetMapping("/detail/{id}")
    public ModelAndView detailPostu(@PathVariable Long id) {
        return new ModelAndView("detail")
                .addObject("post", postReporitory.getReferenceById(id));
    }
/*
    @GetMapping("/detail/{id}")
    public String detail() {
        return "detail";
    }

 */
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


    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail");

        Optional<Post> optionalpost = postRepository.findById(new Long(id));

        if(optionalpost.isPresent()) {
            Post post = optionalpost.get();
            modelAndView.addObject("post", post);
            return modelAndView;
        }
        else{
            throw new ResponseStatusException(NOT_FOUND, "404 not found - nenalezeno.");
        }
    }
}





*/

}

