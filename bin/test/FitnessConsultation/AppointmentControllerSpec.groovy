package FitnessConsultation

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class AppointmentControllerSpec extends Specification implements ControllerUnitTest<AppointmentController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
