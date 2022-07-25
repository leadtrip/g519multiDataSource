package wood.mike

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Exercise)
interface ExerciseService {

    List<Exercise> findAll()

    Exercise save(Exercise exercise)
}
