
package repository;

import java.util.ArrayList;

import dao.AddressDAO;
import model.Quan_Huyen;
import model.Tinh_ThanhPho;
import model.Xa_Phuong;

/**
 * @author MyPC
 *
 */
public class AddressBO {
	//
	AddressDAO s = new AddressDAO();

	// Lấy toàn bộ tỉnh thành phố
	public ArrayList<Tinh_ThanhPho> getTinhThanhPho(){
		return s.getTinhThanhPho();
	}
	// Lấy toàn bộ quận/ huyện theo id tỉnh
	public ArrayList<Quan_Huyen> getQuanHuyenById(long idTinhTP) {
		return s.getQuanHuyenById(idTinhTP);
	}

	// Lấy toàn bộ xã phường theo id huyện
	public ArrayList<Xa_Phuong> getXaPhuongById(long idQuanHuyen){
		return s.getXaPhuongById(idQuanHuyen);
	}

}
