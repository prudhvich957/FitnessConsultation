package FitnessConsultation

import grails.converters.JSON


class AppointmentController {

    def getAppointments(Long consultationId){
        if(consultationId > 0){
            Consultation consultation1 = Consultation.get(consultationId)
            if(consultation1){
                def query = Appointment.where {
                    consultation == consultation1
                }
                def result = query.find()
                render new Response(status: 1, message: "Success", obj: result) as JSON
            }
            else{
                render new Response(status: 0, message: "No consultation present with given trainerId") as JSON
            }
        }
        else{
            render new Response(status: 0, message: "Provide a valid consultationId") as JSON
        }
    }
}