package in.shiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shiv.dao.ReportDao;

@Service
public class ReportService {
	
	@Autowired
	private ReportDao reportDao;
	
/*	@Autowired
//	@Qualifier("oracle")
	@Qualifier("mysql")
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	*/

	/*
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: Constructor");
		this.reportDao = reportDao;
	}
	*/
	
	/*
	public ReportService() {
		System.out.println("ReportService :: Constructor");
	}
	
	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: Constructor");
		this.reportDao = reportDao;
	}
	*/
	public void generateReport() {
		System.out.println("generateReport() :: executed");
		String reportData = reportDao.findAll();
		System.out.println(reportData);
	}

}
