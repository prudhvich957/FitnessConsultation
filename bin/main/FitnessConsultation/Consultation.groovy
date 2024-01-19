package FitnessConsultation

import grails.persistence.Entity

import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity()
class Consultation {

    Client client
    Trainer trainer
    int rating;
    String description
    Services services
    Status status
    String feedback

    static mapping = {
        version false
        status sqlType: "enum('PENDING', 'REJECTED', 'ACCEPTED', 'CLOSED')"

    }

    static constraints = {
        description maxSize: 1000, blank: false
        rating range: 1..5, blank: false
        feedback blank: true, nullable: true
    }
}