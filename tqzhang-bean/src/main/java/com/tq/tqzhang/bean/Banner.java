package com.tq.tqzhang.bean;

import java.util.Date;


//SELECT banner_name, sequence,field1,field2,role_id from banner
/**
 * Created by admin on 16/8/8.
 */
public class Banner {
    private Integer banner_id;
    private String banner_name;
    private int sequence;
    private String field1;
    private String field2;
    private int role_id;
    

   

	public Integer getBanner_id() {
		return banner_id;
	}




	public void setBanner_id(Integer banner_id) {
		this.banner_id = banner_id;
	}




	public String getBanner_name() {
		return banner_name;
	}




	public void setBanner_name(String banner_name) {
		this.banner_name = banner_name;
	}




	public int getSequence() {
		return sequence;
	}




	public void setSequence(int sequence) {
		this.sequence = sequence;
	}




	public String getField1() {
		return field1;
	}




	public void setField1(String field1) {
		this.field1 = field1;
	}




	public String getField2() {
		return field2;
	}




	public void setField2(String field2) {
		this.field2 = field2;
	}




	public int getRole_id() {
		return role_id;
	}




	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}




	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banner{");
        sb.append("banner_id=").append(banner_id);
        sb.append(", bannerName='").append(banner_name).append('\'');
        sb.append(", sequence='").append(sequence).append('\'');
        sb.append(", roleId=").append(role_id);
        sb.append(", field1=").append(field1);
        sb.append('}');
        return sb.toString();
    }
}
