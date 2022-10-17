package com.bhavna.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bhavna.bean.ReferralBean;

public class ReferralDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(ReferralBean r) {
		String sql = "insert into referral(name,id,referrals) values('" + r.getName() + "'," + r.getId() + ",'"
				+ r.getReferrals() + "')";
		return template.update(sql);
	}

	public List<ReferralBean> getReferral() {
		return template.query("select * from referral", new RowMapper<ReferralBean>() {
			public ReferralBean mapRow(ResultSet rs, int row) throws SQLException {
				ReferralBean e = new ReferralBean();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setReferrals(rs.getInt(3));
				return e;
			}

		});
	}
}
