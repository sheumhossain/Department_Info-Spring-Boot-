package repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.simple.apidesign.department_info.model.Students;


public interface StudentsRepository extends MongoRepository<Students, String> {
	
  Students findBy_id(ObjectId _id);
}