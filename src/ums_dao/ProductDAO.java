package ums_dao;

import java.util.ArrayList;
import java.util.HashSet;

import model.Datas;
import ums_dto.ProductDTO;

public class ProductDAO {
	DBConnection conn;
	public ProductDAO() {
		conn = new DBConnection("ProductTable.txt");
	}
	public int getLastNum() {
		String lastPK = conn.lastPK();
		if(lastPK == null) {
			return 0;
		}else {
			return Integer.parseInt(lastPK);
		}
	}
	public boolean addProduct(ProductDTO newProduct) {
		return conn.insert(newProduct.toString());
	}
	
	public String getList(String userid) {
		HashSet<String> rs = conn.select(6, userid);
		String result = "";
		for(String line : rs) {
			String[] datas = line.split("\t");
			result += String.format("%s. %s : %s원(재고 : %s개)\n",
					datas[0], datas[1], datas[2], datas[3]);
		}
		return result;
	}
	public boolean removeProduct(int prodnum) {
		return conn.delete(prodnum + "");
	}
	
	public boolean modifyProduct(String prodnum, int choice, String newData) {
		return conn.update(prodnum, choice, newData);
	}
	
	public boolean removeAll(String userid) {
		boolean check = false;
		
		HashSet<String> rs = conn.select(6, userid);
		for(String line : rs) {
			check = conn.delete(line.split("\t")[0]);
			if(!check) {
				break;
			}
		}
		return check;
	}
	
	public ArrayList<String> search(String keyword) {
		HashSet<String> rs = conn.select();
		ArrayList<String> result = new ArrayList<String>();
		
		for(String line : rs) {
			String[] datas = line.split("\t");
			
			if(datas[1].contains(keyword)) {
				result.add(line);
			}else if(datas[4].contains(keyword)) {
				result.add(line);
			}
		}
		
		return result;
	}
	
	public ProductDTO get(int prodnum) {
		HashSet<String> rs = conn.select(0, prodnum+"");
		for(String line : rs) {
			String[] datas = line.split("\t");
			return new ProductDTO(datas);
		}
		return null;
	}
	
	public boolean updatelikeCnt(int prodnum) {
		//prodnum으로 기존의 좋아요 검색
		//conn.update(prodnum+"", 5, 기존의 좋아요 개수 +1);
		HashSet<String> rs = conn.select(0, prodnum+"");
		int like = 0;
		for(String line : rs) {
			String[] datas = line.split("\t");
			like = (Integer.parseInt(datas[5])+1);
		}
		return conn.update(prodnum+"", 5, like+"");
	}
	
}





















