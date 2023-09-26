package in.shiv.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.shiv.entity.User;
import in.shiv.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	private UserRepository userRepo;

	public void saveData() throws Exception {

		String filePath = "C:\\Users\\shivp\\OneDrive\\Desktop\\shiv\\Details\\New folder\\637969.jpg";
		User user = new User();
		user.setUserName("VINAY SINGH");
		user.setEmail("VINAY1471@GMAIL.COM");
		
		
		long size = Files.size(Paths.get(filePath));
		byte[] arr=new byte[(int)size];
		FileInputStream fis = new FileInputStream(new File(filePath));
		fis.read(arr);
		
		user.setUserImage(arr);

		userRepo.save(user);
	}
	
	public void getData() {
		Optional<User> findById = userRepo.findById(1);
		if(findById.isPresent()) {
			System.out.println(findById);
		}
	}

}
