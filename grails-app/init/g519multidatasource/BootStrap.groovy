package g519multidatasource

import grails.gorm.transactions.Transactional
import sun.util.resources.LocaleData
import wood.mike.Cyclist
import wood.mike.Exercise
import wood.mike.LogEntry

import java.time.LocalDate

class BootStrap {

    def cyclistService
    def exerciseService
    def logEntryService

    def init = { servletContext ->
        addSomeData()
    }

    @Transactional
    def addSomeData() {
        cyclistService.save( new Cyclist(name: 'Bob', dob: LocalDate.now()) )
        cyclistService.save( new Cyclist(name: 'Sue', dob: LocalDate.now()) )

        logEntryService.save( new LogEntry(message: 'Logged in') )
        logEntryService.save( new LogEntry(message: 'Logged out') )

        exerciseService.save( new Exercise(name: 'Squat', bodyPart: 'Legs') )
        exerciseService.save( new Exercise(name: 'Bench press', bodyPart: 'Chest') )
    }

    def destroy = {
    }
}
