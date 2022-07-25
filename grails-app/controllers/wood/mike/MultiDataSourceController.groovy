package wood.mike

class MultiDataSourceController {

    def cyclistService
    def logEntryService
    def exerciseService

    def index() {
        [cyclists: cyclistService.findAll(),
         exercises: exerciseService.findAll(),
         logEntries: logEntryService.findAll()]
    }
}
