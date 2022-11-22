package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="author_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
	@Column(name="aid_col")
	private Integer aid;
	@Column(name="aname_col")
    private String aname;
	

}
