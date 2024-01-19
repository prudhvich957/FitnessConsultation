package FitnessConsultation

import grails.converters.JSON


class ServicesController {

    //VIEW ALL SERVICES AVAILABLE IN PLATFORM
    def index() {
        render new Response(status: 1, obj: Services.list()) as JSON
    }
}