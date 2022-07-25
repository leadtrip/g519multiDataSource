package wood.mike

/**
 * Associated with logging dataSource
 */
class LogEntry {

    Date dateCreated
    String message

    static constraints = {
    }

    static mapping = {
        datasource 'logging'
    }
}
