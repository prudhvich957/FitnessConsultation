package FitnessConsultation

import grails.databinding.BindingFormat
import grails.persistence.Entity

import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity()
class Client {
    String firstName;
    String lastName;
    String gender;
    String address;
    String email;
    @BindingFormat('yyyy-MM-dd HH:mm:ss.S')
    Date dob;

    SessionStatus sessionStatus;
    String password;

    static mapping = {
        version false
        sessionStatus sqlType: "enum('IN', 'OUT')"
    }

    static constraints = {
        firstName size: 3..15, blank: false
        lastName size: 3..15, blank: false
        gender size: 1..2, blank: false
        address size: 7..255, blank: false
        dob max: new Date()
        email email: true, unique: true
        password blank: false
    }
}