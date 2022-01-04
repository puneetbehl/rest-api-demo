package restapidemo

import grails.artefact.Controller
import grails.testing.web.GrailsWebUnitTest
import org.grails.web.util.GrailsApplicationAttributes
import org.springframework.web.servlet.ModelAndView

trait JsonControllerUnitTest implements GrailsWebUnitTest {
    void renderGsonView() {
        ModelAndView modelView =(request.getAttribute(GrailsApplicationAttributes.CONTROLLER) as Controller)?.modelAndView
        modelView?.view?.render(modelView?.model, request, response)
    }
}