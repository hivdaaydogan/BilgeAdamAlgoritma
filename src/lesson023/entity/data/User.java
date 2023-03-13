package lesson023.entity.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lesson023.entity.enums.EStatus;

public class User extends Person {

	private String name;
	private LocalDate birthDay;
	private List<User> following;
	private String acvivateCode;
	private EStatus eStatus;
	private HashMap<User, String> dmListesi;
	
	public User(String id, String email, String password, String name, LocalDate birthDay) {
		super(id, email, password);
		this.name = name;
		this.birthDay = birthDay;
		this.following = new ArrayList<>();
		this.dmListesi = new HashMap<>();
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public String getAcvivateCode() {
		return acvivateCode;
	}

	public void setAcvivateCode(String acvivateCode) {
		this.acvivateCode = acvivateCode;
	}

	public EStatus geteStatus() {
		return eStatus;
	}

	public void seteStatus(EStatus eStatus) {
		this.eStatus = eStatus;
	}

	public HashMap<User, String> getDmListesi() {
		return dmListesi;
	}

	public void setDmListesi(HashMap<User, String> dmListesi) {
		this.dmListesi = dmListesi;
	}
	
	

}
