package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@Column(name="bid_col") 
	private Integer bid;
	@Column(name="bname_col")
    private String bname;
	@Column(name="isbn_col")
    private long isbn_no;
	
	@ManyToOne
	@JoinColumn(name="aid_fk")
	private Author auth;
    
	
}
