package restapidemo

import grails.gorm.services.Service

@Service(Book)
interface BookService {

    Book get(Serializable id)

    List<Book> list(Map args)

    Long count()

    Book delete(Serializable id)

    Book save(Book book)

}
