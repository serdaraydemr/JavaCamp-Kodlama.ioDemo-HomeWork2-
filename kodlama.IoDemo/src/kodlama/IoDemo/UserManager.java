package kodlama.IoDemo;

public class UserManager {
	public void add(User user) {
		System.out.println(user.id +"-" + user.firstName + " " + user.lastName +  " -  Kayıt Başarılı.");
		
	}
	
	public void addMultiple(User[] users ) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.id +"-" + user.firstName + " " + user.lastName +  " - Silme İşlemi Başarılı.");
	}
	
	public void upDate(User user) {
		System.out.println(user.id +"-" + user.firstName + " " + user.lastName +  " - Güncelleme İşlemi Başarılı.");
		
	}
	

}
