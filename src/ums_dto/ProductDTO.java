package ums_dto;

public class ProductDTO {
	int prodnum;
	String prodname;
	int prodprice;
	int prodmount;
	String prodinfo;
	int likecnt;
	String userid;
	
	public ProductDTO(int prodnum, String prodname, int prodprice, int prodmount, String prodinfo, String userid) {
		this.prodnum = prodnum;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodmount = prodmount;
		this.prodinfo = prodinfo;
		this.likecnt = 0;
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		return prodnum+"\t"+prodname+"\t"+prodprice+"\t"+prodmount+"\t"+prodinfo+"\t"+likecnt+"\t"+userid;
	}
	
	
}
