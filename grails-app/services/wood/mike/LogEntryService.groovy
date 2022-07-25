package wood.mike

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(LogEntry)
@Transactional(connection='logging')
interface LogEntryService {

    List<LogEntry> findAll()

    LogEntry save(LogEntry logEntry)
}
