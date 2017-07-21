package linksharing.util;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created by miral on 7/17/2017.
 */
public class ModelAndViewBuilder {
    private ModelAndView modelAndView;

    private ModelAndViewBuilder() {
        modelAndView = new ModelAndView();
    }

    public static ModelAndViewBuilder view(String view) {
        ModelAndViewBuilder builder = new ModelAndViewBuilder();
        builder.modelAndView.setViewName(view);
        return builder;
    }

    public static String redirect(String uriOrUrl) {
        return "redirect:" + uriOrUrl;
    }

    public static String forward(String uri) {
        return "forward:" + uri;
    }

    public ModelAndViewBuilder modelAttr(String name, Object value) {
        modelAndView.addObject(name, value);
        return this;
    }

    public ModelAndView build() {
        return modelAndView;
    }
}
