package wood.mike

import java.time.LocalDate

/**
 * Associated with cyclist dataSource
 */
class Cyclist {

    LocalDate dob
    String name

    static constraints = {
    }

    static mapping = {
        datasource 'cyclist'
    }
}
