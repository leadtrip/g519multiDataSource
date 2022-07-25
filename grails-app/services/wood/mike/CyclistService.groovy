package wood.mike

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Cyclist)
@Transactional(connection='cyclist')
interface CyclistService {

    List<Cyclist> findAll()

    Cyclist save(Cyclist cyclist)
}
