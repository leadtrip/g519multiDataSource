package wood.mike

class LogEntry {

    Date dateCreated
    String message

    static constraints = {
    }

    static mapping = {
        datasource 'logging'
    }
}
