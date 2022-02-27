import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	Vector<Karyawan> vKaryawan = new Vector<>();
	Vector<Manager> vManager = new Vector<>(); 
	Vector<Supervisor> vSupervisor = new Vector<>(); 
	Vector<Admin> vAdmin = new Vector<>(); 
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public Main() {
		int choose = -1;
		do {
			System.out.println("PT Musang");
			System.out.println("1. Insert Data");
			System.out.println("2. View Data");
			System.out.println("3. Update Data");
			System.out.println("4. Delete Data");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choose = scanInt();
			
			switch (choose) {
			case 1:
				menu1();
				break;
				
			case 2:
				menu2();
				break;
				
			case 3:
				menu3();
				break;
				
			case 4:
				menu4();
				break;
				
			case 5:
				System.out.println("Thank you dor using the app");
				break;

			default:
				break;
			}
			
		} while (choose != 5);
	}
	
	public void menu1() {
		String nama = "";
		String jk = "";
		String jabat = "";
		String id = "";
		
		do {
			System.out.print("Input nama karyawan [>= 3]: ");
			nama = scan.nextLine();
		} while (nama.length() < 3);
		
		do {
			System.out.print("Input jenis kelamain [Laki-laki | Perempuan] (Case Sensitive): ");
			jk = scan.nextLine();
		} while (!(jk.equals("Laki-laki") || jk.equals("Perempuan")));
		
		do {
			System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
			jabat = scan.nextLine();
		} while (!(jabat.equals("Manager") || jabat.equals("Supervisor") || jabat.equals("Admin")));
		System.out.println();
		
		while(true) {
			int max = 9999;
			int min = 0;
			int num = (int) (Math.random() * (max + 1 - min)) + min;
			String idtemp = "";
			
			for (int i = 0; i < 2; i++) {
				char randhuruf = (char) (random.nextInt(26) + 'A');
				idtemp += (randhuruf + "");
			}
			
			String temp = "";
			if (num < 10) {
				id = idtemp + "000" + num;
			}else if (num < 100) {
				id = idtemp + "00" + num;
			}else if (num < 1000) {
				id = idtemp + "0" + num;
			}else {
				id = idtemp + num;
			}
			
			break;
		}
		
		Manager newManager = new Manager();
		Supervisor newSupervisor = new Supervisor();
		Admin newAdmin = new Admin();
		
		int gajipokok = -1;
		int bonus = -1;
		int totalgaji = -1;
		if (jabat.equals("Manager")) {
			gajipokok = 8000000;
			if (vManager.size() >= 3 || vManager.size() < 6) {
				bonus = 10/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newManager.setTotalgaji(totalgaji);
				vManager.set(1, newManager);
				vManager.set(2, newManager);
				vManager.set(3, newManager);
				
			}else if (vManager.size() >= 6 || vManager.size() < 9) {
				bonus = 10/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newManager.setTotalgaji(totalgaji);
				vManager.set(1, newManager);
				vManager.set(2, newManager);
				vManager.set(3, newManager);
				vManager.set(4, newManager);
				vManager.set(5, newManager);
				vManager.set(6, newManager);
				
			}else if (vManager.size() >= 9) {
				bonus = 10/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newManager.setTotalgaji(totalgaji);
				vManager.set(1, newManager);
				vManager.set(2, newManager);
				vManager.set(3, newManager);
				vManager.set(4, newManager);
				vManager.set(5, newManager);
				vManager.set(6, newManager);
				vManager.set(7, newManager);
				vManager.set(8, newManager);
				vManager.set(9, newManager);
				
			}else {
				totalgaji = gajipokok;
			}
			newManager.setId(id);
			newManager.setJk(jk);
			newManager.setTotalgaji(totalgaji);
			
		}else if (jabat.equals("Admin")) {
			gajipokok = 4000000;
			if (vAdmin.size() >= 3 || vAdmin.size() < 6) {
				bonus = 5/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newAdmin.setTotalgaji(totalgaji);
				vAdmin.set(1, newAdmin);
				vAdmin.set(2, newAdmin);
				vAdmin.set(3, newAdmin);
				
			}else if (vAdmin.size() >= 6 || vAdmin.size() < 9) {
				bonus = 5/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newAdmin.setTotalgaji(totalgaji);
				vAdmin.set(1, newAdmin);
				vAdmin.set(2, newAdmin);
				vAdmin.set(3, newAdmin);
				vAdmin.set(4, newAdmin);
				vAdmin.set(5, newAdmin);
				vAdmin.set(6, newAdmin);
				
			}else if (vAdmin.size() >= 9) {
				bonus = 5/100 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newAdmin.setTotalgaji(totalgaji);
				vAdmin.set(1, newAdmin);
				vAdmin.set(2, newAdmin);
				vAdmin.set(3, newAdmin);
				vAdmin.set(4, newAdmin);
				vAdmin.set(5, newAdmin);
				vAdmin.set(6, newAdmin);
				vAdmin.set(7, newAdmin);
				vAdmin.set(8, newAdmin);
				vAdmin.set(9, newAdmin);
				
			}else {
				totalgaji = gajipokok;
			}
			newAdmin.setId(id);
			newAdmin.setJk(jk);
			newAdmin.setTotalgaji(totalgaji);
			
		}else if (jabat.equals("Supervisor")) {
			gajipokok = 6000000;
			if (vSupervisor.size() >= 3 || vSupervisor.size() < 6) {
				bonus = 75/1000 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newSupervisor.setTotalgaji(totalgaji);
				vSupervisor.set(1, newSupervisor);
				vSupervisor.set(2, newSupervisor);
				vSupervisor.set(3, newSupervisor);
				
			}else if (vSupervisor.size() >= 6 || vSupervisor.size() < 9) {
				bonus = 75/1000 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newSupervisor.setTotalgaji(totalgaji);
				vSupervisor.set(1, newSupervisor);
				vSupervisor.set(2, newSupervisor);
				vSupervisor.set(3, newSupervisor);
				vSupervisor.set(4, newSupervisor);
				vSupervisor.set(5, newSupervisor);
				vSupervisor.set(6, newSupervisor);
				
			}else if (vSupervisor.size() >= 9) {
				bonus = 75/1000 * gajipokok;
				totalgaji = gajipokok + bonus;
				
				newSupervisor.setTotalgaji(totalgaji);
				vSupervisor.set(1, newSupervisor);
				vSupervisor.set(2, newSupervisor);
				vSupervisor.set(3, newSupervisor);
				vSupervisor.set(4, newSupervisor);
				vSupervisor.set(5, newSupervisor);
				vSupervisor.set(6, newSupervisor);
				vSupervisor.set(7, newSupervisor);
				vSupervisor.set(8, newSupervisor);
				vSupervisor.set(9, newSupervisor);
				
			}else {
				totalgaji = gajipokok;
			}
			newSupervisor.setId(id);
			newSupervisor.setJk(jk);
			newSupervisor.setTotalgaji(totalgaji);
			
		}
		
		Karyawan newKaryawan = new Karyawan();
		newKaryawan.setNama(nama);
		newKaryawan.setId(id);
		newKaryawan.setJabat(jabat);
		newKaryawan.setJk(jk);
		vKaryawan.add(newKaryawan);
		
		System.out.println("Berhasil menambahkan karyawan dengan id " + id);
		
		}
	
	
	public void menu2() {
		if (vKaryawan.isEmpty()) {
			System.out.println("Tidak ada data");
			System.out.println();
		}else {
			
			for (int i = 0; i < vKaryawan.size()-1; i++) {
				for (int j = 0; j < vKaryawan.size()-1-i; j++) {
					if (vKaryawan.get(j).getNama().charAt(0) > vKaryawan.get(j+1).getNama().charAt(0)) {
						Karyawan temp = vKaryawan.get(j);
						vKaryawan.set(j, vKaryawan.get(j+1));
						vKaryawan.set(j+1, temp);
					}
				}
			}
			
			System.out.println();
			System.out.println("List Karyawan");
			System.out.println("=========================================================================================================");
			System.out.printf("| %-3s | %-10s | %-10s | %-10s | %-10s |  %-10s | \n", "No", "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
			System.out.println("=========================================================================================================");
			for (int i = 0; i < vKaryawan.size(); i++) {
				System.out.printf("| %-3s | %-13s | %-13s | %-13s | %-10s |  %-13s | \n", (i+1), vKaryawan.get(i).getNama(), vKaryawan.get(i).getJk(), vKaryawan.get(i).getJabat(), vKaryawan.get(i).getTotalgaji());
				System.out.println("----------------------------------------------------------------------------------------------------------");
			}
		}
	}
	
	public void menu3() {
		menu2();
		
		if (vKaryawan.isEmpty()) {
			System.out.println("Tidak ada data untuk diupdate");
			System.out.println();
		}else {
			String nama = "";
			String jk = "";
			String jabat = "";
			String id = "";
			int choose;
			do {
				System.out.print("Input nomor urutan karyawan yang ingin diupdate: ");
				choose = scanInt();
			} while (choose < 1 || choose > vKaryawan.size());
			
			do {
				System.out.print("Input nama karyawan [>= 3]: ");
				nama = scan.nextLine();
			} while (nama.length() < 3);
			
			do {
				System.out.print("Input jenis kelamain [Laki-laki | Perempuan] (Case Sensitive): ");
				jk = scan.nextLine();
			} while (!(jk.equals("Laki-laki") || jk.equals("Perempuan")));
			
			do {
				System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
				jabat = scan.nextLine();
			} while (!(jabat.equals("Manager") || jabat.equals("Supervisor") || jabat.equals("Admin")));
			
			id = vKaryawan.get(choose-1).getId();
			Karyawan newKaryawan = new Karyawan();
			newKaryawan.setNama(nama);
			newKaryawan.setId(id);
			newKaryawan.setJk(jk);
			newKaryawan.setJabat(jabat);
			
			vKaryawan.set(choose - 1, newKaryawan);
			
			System.out.println("Berhasil mengupdate karyawan dengan id " + vKaryawan.get(choose-1).getId());
			System.out.println("ENTER to return");
			scan.nextLine();
			System.out.println();
		}
		
	}
	
	public void menu4() {
		menu2();
		
		if (vKaryawan.isEmpty()) {
			System.out.println("Tidak ada data untuk dihapus");
			System.out.println();
		}else {
			int choose;
			do {
				System.out.print("Input nomor urutan karyawan yang ingin dihapus: ");
				choose = scanInt();
			} while (choose < 1 || choose > vKaryawan.size());
			
			System.out.println("Karyawan dengan kode " + vKaryawan.get(choose-1).getId() + " berhasil dihapus");
			System.out.println("ENTER to return");
			scan.nextLine();
			System.out.println();
			vKaryawan.remove(choose-1);
			
		}
	}
	
	int scanInt() {
		int input;
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			input = Integer.MIN_VALUE;
		}
		scan.nextLine();
		return input;
	}
	
	public static void main(String[] args) {
		new Main();

	}

}

