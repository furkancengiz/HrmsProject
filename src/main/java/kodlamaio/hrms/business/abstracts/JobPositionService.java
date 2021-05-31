package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
		DataResult<List<JobPosition>> getAll();
		Result add(JobPosition jobPosition);
		Result update(JobPosition jobPosition);
		Result delete(int id);
		
		DataResult<List<JobPosition>> getByisActiveTrue();
		DataResult<List<JobPosition>> getByisActiveAndEmployer_companyName(String companyName);
		DataResult<List<JobPosition>> getByisActiveTrueOrderByCreatedDate();
		DataResult<JobPosition> getById(int id);

}		
