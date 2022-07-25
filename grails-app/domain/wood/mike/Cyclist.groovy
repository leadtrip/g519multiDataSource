package wood.mike

import java.time.LocalDate

class Cyclist {

    LocalDate dob
    String name

    static constraints = {
    }

    static mapping = {
        datasource 'cyclist'
    }
}
